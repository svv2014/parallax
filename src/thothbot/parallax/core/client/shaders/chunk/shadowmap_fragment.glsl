#ifdef USE_SHADOWMAP

	#ifdef SHADOWMAP_DEBUG

		vec3 frustumColors[3];
		frustumColors[0] = vec3( 1.0, 0.5, 0.0 );
		frustumColors[1] = vec3( 0.0, 1.0, 0.8 );
		frustumColors[2] = vec3( 0.0, 0.5, 1.0 );

	#endif

	#ifdef SHADOWMAP_CASCADE

		int inFrustumCount = 0;

	#endif

	float fDepth;
	vec3 shadowColor = vec3( 1.0 );

	for( int i = 0; i < MAX_SHADOWS; i ++ ) {

		vec3 shadowCoord = vShadowCoord[ i ].xyz / vShadowCoord[ i ].w;

		// "if ( something && something )" 		 breaks ATI OpenGL shader compiler
		// "if ( all( something, something ) )"  using this instead

		bvec4 inFrustumVec = bvec4 ( shadowCoord.x >= 0.0, shadowCoord.x <= 1.0, shadowCoord.y >= 0.0, shadowCoord.y <= 1.0 );
		bool inFrustum = all( inFrustumVec );

		// don't shadow pixels outside of light frustum
		// use just first frustum (for cascades)
		// don't shadow pixels behind far plane of light frustum

		#ifdef SHADOWMAP_CASCADE

			inFrustumCount += int( inFrustum );
			bvec3 frustumTestVec = bvec3( inFrustum, inFrustumCount == 1, shadowCoord.z <= 1.0 );

		#else

			bvec2 frustumTestVec = bvec2( inFrustum, shadowCoord.z <= 1.0 );

		#endif

		bool frustumTest = all( frustumTestVec );

		if ( frustumTest ) {

			shadowCoord.z += shadowBias[ i ];

			#ifdef SHADOWMAP_SOFT

				// Percentage-close filtering
				// (9 pixel kernel)
				// http://fabiensanglard.net/shadowmappingPCF/

				float shadow = 0.0;

				/*
				// nested loops breaks shader compiler / validator on some ATI cards when using OpenGL
				// must enroll loop manually

				for ( float y = -1.25; y <= 1.25; y += 1.25 )
					for ( float x = -1.25; x <= 1.25; x += 1.25 ) {

						vec4 rgbaDepth = texture2D( shadowMap[ i ], vec2( x * xPixelOffset, y * yPixelOffset ) + shadowCoord.xy );

						// doesn't seem to produce any noticeable visual difference compared to simple "texture2D" lookup
						//"vec4 rgbaDepth = texture2DProj( shadowMap[ i ], vec4( vShadowCoord[ i ].w * ( vec2( x * xPixelOffset, y * yPixelOffset ) + shadowCoord.xy ), 0.05, vShadowCoord[ i ].w ) );

						float fDepth = unpackDepth( rgbaDepth );

						if ( fDepth < shadowCoord.z )
							shadow += 1.0;

				}

				shadow /= 9.0;

				*/

				const float shadowDelta = 1.0 / 9.0;

				float xPixelOffset = 1.0 / shadowMapSize[ i ].x;
				float yPixelOffset = 1.0 / shadowMapSize[ i ].y;

				float dx0 = -1.25 * xPixelOffset;
				float dy0 = -1.25 * yPixelOffset;
				float dx1 = 1.25 * xPixelOffset;
				float dy1 = 1.25 * yPixelOffset;

				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx0, dy0 ) ) );
				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;

				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( 0.0, dy0 ) ) );
				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;

				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx1, dy0 ) ) );
				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;

				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx0, 0.0 ) ) );
				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;

				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy ) );
				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;

				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx1, 0.0 ) ) );
				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;

				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx0, dy1 ) ) );
				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;

				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( 0.0, dy1 ) ) );
				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;

				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx1, dy1 ) ) );
				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;

				shadowColor = shadowColor * vec3( ( 1.0 - shadowDarkness[ i ] * shadow ) );

			#else

				vec4 rgbaDepth = texture2D( shadowMap[ i ], shadowCoord.xy );
				float fDepth = unpackDepth( rgbaDepth );

				if ( fDepth < shadowCoord.z )

					// spot with multiple shadows is darker

					shadowColor = shadowColor * vec3( 1.0 - shadowDarkness[ i ] );

					// spot with multiple shadows has the same color as single shadow spot

					//"shadowColor = min( shadowColor, vec3( shadowDarkness[ i ] ) );

			#endif

		}


		#ifdef SHADOWMAP_DEBUG

			#ifdef SHADOWMAP_CASCADE

				if ( inFrustum && inFrustumCount == 1 ) gl_FragColor.xyz *= frustumColors[ i ];

			#else

				if ( inFrustum ) gl_FragColor.xyz *= frustumColors[ i ];

			#endif

		#endif

	}

	#ifdef GAMMA_OUTPUT

		shadowColor *= shadowColor;

	#endif

	gl_FragColor.xyz = gl_FragColor.xyz * shadowColor;

#endif