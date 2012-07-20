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

package thothbot.parallax.core.client.shader;

import java.util.Arrays;
import java.util.List;

import thothbot.parallax.core.shared.core.Color3f;
import thothbot.parallax.core.shared.core.Vector3f;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.TextResource;

/**
 * Phong shading - lighting model three-dimensional objects, 
 * including models and polygonal primitives.
 * <p>
 * Based on three.js code.
 * 
 * @author thothbot
 *
 */
public final class ShaderPhong extends Shader
{

	interface Resources extends DefaultResources
	{
		Resources INSTANCE = GWT.create(Resources.class);
		
		@Source("chunk/phong_vs.chunk")
		TextResource getVertexShader();

		@Source("chunk/phong_fs.chunk")
		TextResource getFragmentShader();
	}
	
	public ShaderPhong() 
	{
		super(Resources.INSTANCE);
	}

	@Override
	protected void initUniforms()
	{
		this.addUniform(UniformsLib.common);
		this.addUniform(UniformsLib.fog);
		this.addUniform(UniformsLib.lights);
		this.addUniform(UniformsLib.shadowmap);
		this.addUniform("ambient", new Uniform(Uniform.TYPE.C, new Color3f( 0xffffff ) ));
		this.addUniform("emissive", new Uniform(Uniform.TYPE.C, new Color3f( 0x000000 ) ));
		this.addUniform("specular", new Uniform(Uniform.TYPE.C, new Color3f( 0x111111 ) ));
		this.addUniform("shininess", new Uniform(Uniform.TYPE.F, 30.0f ));
		this.addUniform("wrapRGB", new Uniform(Uniform.TYPE.V3, new Vector3f( 1, 1, 1 ) ));
	}
	
	@Override
	protected void setVertexSource(String src)
	{
		List<String> vars = Arrays.asList(
			ChunksVertexShader.MAP_PARS,
			ChunksVertexShader.LIGHTMAP_PARS,
			ChunksVertexShader.ENVMAP_PARS,
			ChunksVertexShader.LIGHTS_PHONG_PARS,
			ChunksVertexShader.COLOR_PARS,
			ChunksVertexShader.SKINNING_PARS,
			ChunksVertexShader.MORPH_TARGET_PARS,
			ChunksVertexShader.SHADOWMAP_PARS
		);
		
		List<String> main = Arrays.asList(
			ChunksVertexShader.MAP,
			ChunksVertexShader.LIGHTMAP,
			ChunksVertexShader.ENVMAP,
			ChunksVertexShader.COLOR
		);

		List<String> main2 = Arrays.asList(
			ChunksVertexShader.MORPH_NORMAL
		);

		List<String> main3 = Arrays.asList(
			ChunksVertexShader.LIGHTS_PHONG,
			ChunksVertexShader.SKINNING,
			ChunksVertexShader.MORPH_TARGET,
			ChunksVertexShader.DEFAULT,
			ChunksVertexShader.SHADOWMAP
		);

		super.setVertexSource(Shader.updateShaderSource(src, vars, main, main2, main3));
	}
	
	@Override
	protected void setFragmentSource(String src)
	{
		List<String> vars = Arrays.asList(
			ChunksFragmentShader.COLOR_PARS,
			ChunksFragmentShader.MAP_PARS,
			ChunksFragmentShader.LIGHTMAP_PARS,
			ChunksFragmentShader.ENVMAP_PARS,
			ChunksFragmentShader.FOG_PARS,
			ChunksFragmentShader.LIGHTS_PONG_PARS,
			ChunksFragmentShader.SHADOWMAP_PARS
		);
		
		List<String> main = Arrays.asList(
			ChunksFragmentShader.MAP,
			ChunksFragmentShader.ALPHA_TEST,
			ChunksFragmentShader.LIGHTS_PONG,
					
			ChunksFragmentShader.LIGHTMAP,
			ChunksFragmentShader.COLOR,
			ChunksFragmentShader.ENVMAP,
			ChunksFragmentShader.SHADOWMAP,
			ChunksFragmentShader.LENEAR_TO_GAMMA,
			ChunksFragmentShader.FOG
		);
		
		super.setFragmentSource(Shader.updateShaderSource(src, vars, main));		
	}

}