/*
 * Copyright 2012 Alex Usachev, thothbot@gmail.com
 * 
 * This file based on the JavaScript source file of the THREE.JS project, 
 * licensed under MIT License.
 * 
 * This file is part of Parallax project.
 * 
 * Parallax is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by the 
 * Free Software Foundation, either version 3 of the License, or (at your 
 * option) any later version.
 * 
 * Parallax is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 * for more details.
 * 
 * You should have received a copy of the GNU General Public License along with 
 * Parallax. If not, see http://www.gnu.org/licenses/.
 */

package thothbot.parallax.core.shared.geometries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import thothbot.parallax.core.shared.core.Face4;
import thothbot.parallax.core.shared.core.Geometry;
import thothbot.parallax.core.shared.core.UV;
import thothbot.parallax.core.shared.core.Vector3;

/**
 * The Torus geometry
 * <p>
 * <img src="http://thothbot.github.com/parallax/static/docs/torus.gif" />
 * <p>
 * Based on the three.js code.
 * 
 * @author thothbot
 *
 */
public final class Torus extends Geometry
{
	
	public Torus() 
	{
		this(100, 40, 8, 6);
	}
	
	public Torus(int radius, int tube, int segmentsR, int segmentsT) 
	{
		this(radius, tube, segmentsR, segmentsT, Math.PI * 2.0);
	}
	
	public Torus(int radius, int tube, int segmentsR, int segmentsT, double arc) 
	{
		super();
		
		Vector3 center = new Vector3();
		List<UV> uvs = new ArrayList<UV>();
		List<Vector3> normals = new ArrayList<Vector3>();
		
		for ( int j = 0; j <= segmentsR; j ++ ) 
		{
			for ( int i = 0; i <= segmentsT; i ++ ) 
			{
				double u = i / (double)segmentsT * arc;
				double v = j / (double)segmentsR * Math.PI * 2.0;

				center.setX(radius * Math.cos( u ));
				center.setY(radius * Math.sin( u ));

				Vector3 vertex = new Vector3();
				vertex.setX(( radius + tube * Math.cos( v ) ) * Math.cos( u ));
				vertex.setY(( radius + tube * Math.cos( v ) ) * Math.sin( u ));
				vertex.setZ(tube * Math.sin( v ));

				getVertices().add( vertex );

				uvs.add( new UV( i / (double)segmentsT, j / (double)segmentsR * 1.8 ) );
				normals.add( vertex.clone().sub( center ).normalize() );
			}
		}

		for ( int j = 1; j <= segmentsR; j ++ ) 
		{
			for ( int i = 1; i <= segmentsT; i ++ ) 
			{
				int a = ( segmentsT + 1 ) * j + i - 1;
				int b = ( segmentsT + 1 ) * ( j - 1 ) + i - 1;
				int c = ( segmentsT + 1 ) * ( j - 1 ) + i;
				int d = ( segmentsT + 1 ) * j + i;

				Face4 face = new Face4( a, b, c, d, Arrays.asList(normals.get( a ), normals.get( b ), normals.get( c ), normals.get( d ) ) );
				face.getNormal().add( normals.get( a ) );
				face.getNormal().add( normals.get( b ) );
				face.getNormal().add( normals.get( c ) );
				face.getNormal().add( normals.get( d ) );
				face.getNormal().normalize();

				getFaces().add( face );
				getFaceVertexUvs().get( 0 ).add( 
						Arrays.asList(uvs.get( a ).clone(), uvs.get( b ).clone(), uvs.get( c ).clone(), uvs.get( d ).clone() ) );
			}

		}

		this.computeCentroids();
	}
}
