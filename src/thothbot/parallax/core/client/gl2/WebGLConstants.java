/*
 * Copyright 2012 Alex Usachev, thothbot@gmail.com
 * 
 * This file is part of Parallax project.
 * 
 * Parallax is free software: you can redistribute it and/or modify it 
 * under the terms of the Creative Commons Attribution 3.0 Unported License.
 * 
 * Parallax is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 * or FITNESS FOR A PARTICULAR PURPOSE. See the Creative Commons Attribution 
 * 3.0 Unported License. for more details.
 * 
 * You should have received a copy of the the Creative Commons Attribution 
 * 3.0 Unported License along with Parallax. 
 * If not, see http://creativecommons.org/licenses/by/3.0/.
 */

package thothbot.parallax.core.client.gl2;

/**
 * All GL2 flags
 * 
 * @author thothbot
 */
public class WebGLConstants 
{
	/* ClearBufferMask */
	public static final int DEPTH_BUFFER_BIT = 0x00000100;
	public static final int STENCIL_BUFFER_BIT = 0x00000400;
	public static final int COLOR_BUFFER_BIT = 0x00004000;
	
	 /* BeginMode */
	public static final int POINTS = 0x0000;
	public static final int LINES = 0x0001;
	public static final int LINE_LOOP = 0x0002;
	public static final int LINE_STRIP = 0x0003;
	public static final int TRIANGLES = 0x0004;
	public static final int TRIANGLE_STRIP = 0x0005;
	public static final int TRIANGLE_FAN = 0x0006;
	
	/* BlendingFactorDest */
	public static final int ZERO = 0;
	public static final int ONE = 1;
	public static final int SRC_COLOR = 0x0300;
	public static final int ONE_MINUS_SRC_COLOR = 0x0301;
	public static final int SRC_ALPHA = 0x0302;
	public static final int ONE_MINUS_SRC_ALPHA = 0x0303;
	public static final int DST_ALPHA = 0x0304;
	public static final int ONE_MINUS_DST_ALPHA = 0x0305;
	
	/* BlendingFactorSrc */
    /*      ZERO */
    /*      ONE */
	public static final int DST_COLOR = 0x0306;
	public static final int ONE_MINUS_DST_COLOR = 0x0307;
	public static final int SRC_ALPHA_SATURATE = 0x0308;
	/*      SRC_ALPHA */
    /*      ONE_MINUS_SRC_ALPHA */
    /*      DST_ALPHA */
    /*      ONE_MINUS_DST_ALPHA */
	
	 /* BlendEquationSeparate */
	public static final int FUNC_ADD = 0x8006;
	public static final int BLEND_EQUATION = 0x8009;
	public static final int BLEND_EQUATION_RGB = 0x8009;
	public static final int BLEND_EQUATION_ALPHA = 0x883D;
	
	 /* BlendSubtract */
	public static final int FUNC_SUBTRACT = 0x800A;
	public static final int FUNC_REVERSE_SUBTRACT = 0x800B;
	
	/* Separate Blend Functions */
	public static final int BLEND_DST_RGB = 0x80C8;
	public static final int BLEND_SRC_RGB = 0x80C9;
	public static final int BLEND_DST_ALPHA = 0x80CA;
	public static final int BLEND_SRC_ALPHA = 0x80CB;
	public static final int CONSTANT_COLOR = 0x8001;
	public static final int ONE_MINUS_CONSTANT_COLOR = 0x8002;
	public static final int CONSTANT_ALPHA = 0x8003;
	public static final int ONE_MINUS_CONSTANT_ALPHA = 0x8004;
	public static final int BLEND_COLOR = 0x8005;
	
	/* Buffer Objects */
	public static final int ARRAY_BUFFER = 0x8892;
	public static final int ELEMENT_ARRAY_BUFFER = 0x8893;
	public static final int ARRAY_BUFFER_BINDING = 0x8894;
	public static final int ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;
	
	public static final int STREAM_DRAW = 0x88E0;
	public static final int STATIC_DRAW = 0x88E4;
	public static final int DYNAMIC_DRAW = 0x88E8;
	
	public static final int BUFFER_SIZE = 0x8764;
	public static final int BUFFER_USAGE = 0x8765;
	
	public static final int CURRENT_VERTEX_ATTRIB = 0x8626;
	
	/* CullFaceMode */
	public static final int FRONT = 0x0404;
	public static final int BACK = 0x0405;
	public static final int FRONT_AND_BACK = 0x0408;
	
	/* EnableCap */
	/* TEXTURE_2D */
	public static final int CULL_FACE = 0x0B44;
	public static final int BLEND = 0x0BE2;
	public static final int DITHER = 0x0BD0;
	public static final int STENCIL_TEST = 0x0B90;
	public static final int DEPTH_TEST = 0x0B71;
	public static final int SCISSOR_TEST = 0x0C11;
	public static final int POLYGON_OFFSET_FILL = 0x8037;
	public static final int SAMPLE_ALPHA_TO_COVERAGE = 0x809E;
	public static final int SAMPLE_COVERAGE = 0x80A0;
	
	/* ErrorCode */
	public static final int NO_ERROR = 0;
	public static final int INVALID_ENUM = 0x0500;
	public static final int INVALID_VALUE = 0x0501;
	public static final int INVALID_OPERATION = 0x0502;
	public static final int OUT_OF_MEMORY = 0x0505;
	
	/* FrontFaceDirection */
	public static final int CW = 0x0900;
	public static final int CCW = 0x0901;
	
	 /* GetPName */
	public static final int LINE_WIDTH = 0x0B21;
	public static final int ALIASED_POINT_SIZE_RANGE = 0x846D;
	public static final int ALIASED_LINE_WIDTH_RANGE = 0x846E;
	public static final int CULL_FACE_MODE = 0x0B45;
	public static final int FRONT_FACE = 0x0B46;
	public static final int DEPTH_RANGE = 0x0B70;
	public static final int DEPTH_WRITEMASK = 0x0B72;
	public static final int DEPTH_CLEAR_VALUE = 0x0B73;
	public static final int DEPTH_FUNC = 0x0B74;
	public static final int STENCIL_CLEAR_VALUE = 0x0B91;
	public static final int STENCIL_FUNC = 0x0B92;
	public static final int STENCIL_FAIL = 0x0B94;
	public static final int STENCIL_PASS_DEPTH_FAIL = 0x0B95;
	public static final int STENCIL_PASS_DEPTH_PASS = 0x0B96;
	public static final int STENCIL_REF = 0x0B97;
	public static final int STENCIL_VALUE_MASK = 0x0B93;
	public static final int STENCIL_WRITEMASK = 0x0B98;
	public static final int STENCIL_BACK_FUNC = 0x8800;
	public static final int STENCIL_BACK_FAIL = 0x8801;
	public static final int STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;
	public static final int STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;
	public static final int STENCIL_BACK_REF = 0x8CA3;
	public static final int STENCIL_BACK_VALUE_MASK = 0x8CA4;
	public static final int STENCIL_BACK_WRITEMASK = 0x8CA5;
	public static final int VIEWPORT = 0x0BA2;
	public static final int SCISSOR_BOX = 0x0C10;
	/*      SCISSOR_TEST */
	public static final int COLOR_CLEAR_VALUE = 0x0C22;
	public static final int COLOR_WRITEMASK = 0x0C23;
	public static final int UNPACK_ALIGNMENT = 0x0CF5;
	public static final int PACK_ALIGNMENT = 0x0D05;
	public static final int MAX_TEXTURE_SIZE = 0x0D33;
	public static final int MAX_VIEWPORT_DIMS = 0x0D3A;
	public static final int SUBPIXEL_BITS = 0x0D50;
	public static final int RED_BITS = 0x0D52;
	public static final int GREEN_BITS = 0x0D53;
	public static final int BLUE_BITS = 0x0D54;
	public static final int ALPHA_BITS = 0x0D55;
	public static final int DEPTH_BITS = 0x0D56;
	public static final int STENCIL_BITS = 0x0D57;
	public static final int POLYGON_OFFSET_UNITS = 0x2A00;
	/*      POLYGON_OFFSET_FILL */
	public static final int POLYGON_OFFSET_FACTOR = 0x8038;
	public static final int TEXTURE_BINDING_2D = 0x8069;
	public static final int SAMPLE_BUFFERS = 0x80A8;
	public static final int SAMPLES = 0x80A9;
	public static final int SAMPLE_COVERAGE_VALUE = 0x80AA;
	public static final int SAMPLE_COVERAGE_INVERT = 0x80AB;
	public static final int NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;
	
	public static final int COMPRESSED_TEXTURE_FORMATS = 0x86A3;
	
	/* HintMode */
	public static final int DONT_CARE = 0x1100;
	public static final int FASTEST = 0x1101;
	public static final int NICEST = 0x1102;
	
	/* HintTarget */
	public static final int GENERATE_MIPMAP_HINT = 0x8192;
	
	/* DataType */
	public static final int BYTE = 0x1400;
	public static final int UNSIGNED_BYTE = 0x1401;
	public static final int SHORT = 0x1402;
	public static final int UNSIGNED_SHORT = 0x1403;
	public static final int INT = 0x1404;
	public static final int UNSIGNED_INT = 0x1405;
	public static final int FLOAT = 0x1406;
	
	/* PixelFormat */
	public static final int DEPTH_COMPONENT = 0x1902;
	public static final int ALPHA = 0x1906;
	public static final int RGB = 0x1907;
	public static final int RGBA = 0x1908;
	public static final int LUMINANCE = 0x1909;
	public static final int LUMINANCE_ALPHA = 0x190A;
	
	 /* PixelType */
    /*      UNSIGNED_BYTE */
	public static final int UNSIGNED_SHORT_4_4_4_4 = 0x8033;
	public static final int UNSIGNED_SHORT_5_5_5_1 = 0x8034;
	public static final int UNSIGNED_SHORT_5_6_5 = 0x8363;
	
	/* Shaders */
	public static final int FRAGMENT_SHADER = 0x8B30;
	public static final int VERTEX_SHADER = 0x8B31;
	public static final int MAX_VERTEX_ATTRIBS = 0x8869;
	public static final int MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB;
	public static final int MAX_VARYING_VECTORS = 0x8DFC;
	public static final int MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;
	public static final int MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;
	public static final int MAX_TEXTURE_IMAGE_UNITS = 0x8872;
	public static final int MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD;
	public static final int SHADER_TYPE = 0x8B4F;
	public static final int DELETE_STATUS = 0x8B80;
	public static final int LINK_STATUS = 0x8B82;
	public static final int VALIDATE_STATUS = 0x8B83;
	public static final int ATTACHED_SHADERS = 0x8B85;
	public static final int ACTIVE_UNIFORMS = 0x8B86;
	public static final int ACTIVE_UNIFORM_MAX_LENGTH = 0x8B87;
	public static final int ACTIVE_ATTRIBUTES = 0x8B89;
	public static final int ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A;
	public static final int SHADING_LANGUAGE_VERSION = 0x8B8C;
	public static final int CURRENT_PROGRAM = 0x8B8D;
	
	/* StencilFunction */
	public static final int NEVER = 0x0200;
	public static final int LESS = 0x0201;
	public static final int EQUAL = 0x0202;
	public static final int LEQUAL = 0x0203;
	public static final int GREATER = 0x0204;
	public static final int NOTEQUAL = 0x0205;
	public static final int GEQUAL = 0x0206;
	public static final int ALWAYS = 0x0207;
	
	/* StencilOp */
    /*      ZERO */
	public static final int KEEP = 0x1E00;
	public static final int REPLACE = 0x1E01;
	public static final int INCR = 0x1E02;
	public static final int DECR = 0x1E03;
	public static final int INVERT = 0x150A;
	public static final int INCR_WRAP = 0x8507;
	public static final int DECR_WRAP = 0x8508;
	
	/* StringName */
	public static final int VENDOR = 0x1F00;
	public static final int RENDERER = 0x1F01;
	public static final int VERSION = 0x1F02;
	public static final int EXTENSIONS = 0x1F03;
	
	/* TextureMagFilter */
	public static final int NEAREST = 0x2600;
	public static final int LINEAR = 0x2601;
	
	/* TextureMinFilter */
    /*      NEAREST */
    /*      LINEAR */
	public static final int NEAREST_MIPMAP_NEAREST = 0x2700;
	public static final int LINEAR_MIPMAP_NEAREST = 0x2701;
	public static final int NEAREST_MIPMAP_LINEAR = 0x2702;
	public static final int LINEAR_MIPMAP_LINEAR = 0x2703;
	
	/* TextureParameterName */
	public static final int TEXTURE_MAG_FILTER = 0x2800;
	public static final int TEXTURE_MIN_FILTER = 0x2801;
	public static final int TEXTURE_WRAP_S = 0x2802;
	public static final int TEXTURE_WRAP_T = 0x2803;
	
	/* TextureTarget */
	public static final int TEXTURE = 0x1702;
	public static final int TEXTURE_2D = 0x0DE1;
	
	public static final int TEXTURE_CUBE_MAP = 0x8513;
	public static final int TEXTURE_BINDING_CUBE_MAP = 0x8514;
	public static final int TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;
	public static final int TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;
	public static final int TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;
	public static final int TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;
	public static final int TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;
	public static final int TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;
	public static final int MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;
	
	/* TextureUnit */
	public static final int TEXTURE0 = 0x84C0;
	public static final int TEXTURE1 = 0x84C1;
	public static final int TEXTURE2 = 0x84C2;
	public static final int TEXTURE3 = 0x84C3;
	public static final int TEXTURE4 = 0x84C4;
	public static final int TEXTURE5 = 0x84C5;
	public static final int TEXTURE6 = 0x84C6;
	public static final int TEXTURE7 = 0x84C7;
	public static final int TEXTURE8 = 0x84C8;
	public static final int TEXTURE9 = 0x84C9;
	public static final int TEXTURE10 = 0x84CA;
	public static final int TEXTURE11 = 0x84CB;
	public static final int TEXTURE12 = 0x84CC;
	public static final int TEXTURE13 = 0x84CD;
	public static final int TEXTURE14 = 0x84CE;
	public static final int TEXTURE15 = 0x84CF;
	public static final int TEXTURE16 = 0x84D0;
	public static final int TEXTURE17 = 0x84D1;
	public static final int TEXTURE18 = 0x84D2;
	public static final int TEXTURE19 = 0x84D3;
	public static final int TEXTURE20 = 0x84D4;
	public static final int TEXTURE21 = 0x84D5;
	public static final int TEXTURE22 = 0x84D6;
	public static final int TEXTURE23 = 0x84D7;
	public static final int TEXTURE24 = 0x84D8;
	public static final int TEXTURE25 = 0x84D9;
	public static final int TEXTURE26 = 0x84DA;
	public static final int TEXTURE27 = 0x84DB;
	public static final int TEXTURE28 = 0x84DC;
	public static final int TEXTURE29 = 0x84DD;
	public static final int TEXTURE30 = 0x84DE;
	public static final int TEXTURE31 = 0x84DF;
	public static final int ACTIVE_TEXTURE = 0x84E0;
	
	/* TextureWrapMode */
	public static final int REPEAT = 0x2901;
	public static final int CLAMP_TO_EDGE = 0x812F;
	public static final int MIRRORED_REPEAT = 0x8370;
	
	/* Uniform Types */
	public static final int FLOAT_VEC2 = 0x8B50;
	public static final int FLOAT_VEC3 = 0x8B51;
	public static final int FLOAT_VEC4 = 0x8B52;
	public static final int INT_VEC2 = 0x8B53;
	public static final int INT_VEC3 = 0x8B54;
	public static final int INT_VEC4 = 0x8B55;
	public static final int BOOL = 0x8B56;
	public static final int BOOL_VEC2 = 0x8B57;
	public static final int BOOL_VEC3 = 0x8B58;
	public static final int BOOL_VEC4 = 0x8B59;
	public static final int FLOAT_MAT2 = 0x8B5A;
	public static final int FLOAT_MAT3 = 0x8B5B;
	public static final int FLOAT_MAT4 = 0x8B5C;
	public static final int SAMPLER_2D = 0x8B5E;
	public static final int SAMPLER_CUBE = 0x8B60;
	
	/* Uniform Types */
	public static final int VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;
	public static final int VERTEX_ATTRIB_ARRAY_SIZE = 0x8623;
	public static final int VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624;
	public static final int VERTEX_ATTRIB_ARRAY_TYPE = 0x8625;
	public static final int VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;
	public static final int VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;
	public static final int VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;
	public static final int IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A;
	public static final int IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;
	
	/* Shader Source */
	public static final int COMPILE_STATUS = 0x8B81;
	public static final int INFO_LOG_LENGTH = 0x8B84;
	public static final int SHADER_SOURCE_LENGTH = 0x8B88;
	public static final int SHADER_COMPILER = 0x8DFA;
	
	/* Shader Precision-Specified Types */
	public static final int LOW_FLOAT = 0x8DF0;
	public static final int MEDIUM_FLOAT = 0x8DF1;
	public static final int HIGH_FLOAT = 0x8DF2;
	public static final int LOW_INT = 0x8DF3;
	public static final int MEDIUM_INT = 0x8DF4;
	public static final int HIGH_INT = 0x8DF5;
	
	/* Framebuffer Object. */
	public static final int FRAMEBUFFER = 0x8D40;
	public static final int RENDERBUFFER = 0x8D41;
	
	public static final int RGBA4 = 0x8056;
	public static final int RGB5_A1 = 0x8057;
	public static final int RGB565 = 0x8D62;
	public static final int DEPTH_COMPONENT16 = 0x81A5;
	public static final int STENCIL_INDEX = 0x1901;
	public static final int STENCIL_INDEX8 = 0x8D48;
	public static final int DEPTH_STENCIL = 0x84F9;
	
	public static final int RENDERBUFFER_WIDTH = 0x8D42;
	public static final int RENDERBUFFER_HEIGHT = 0x8D43;
	public static final int RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;
	public static final int RENDERBUFFER_RED_SIZE = 0x8D50;
	public static final int RENDERBUFFER_GREEN_SIZE = 0x8D51;
	public static final int RENDERBUFFER_BLUE_SIZE = 0x8D52;
	public static final int RENDERBUFFER_ALPHA_SIZE = 0x8D53;
	public static final int RENDERBUFFER_DEPTH_SIZE = 0x8D54;
	public static final int RENDERBUFFER_STENCIL_SIZE = 0x8D55;
	
	public static final int FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;
	public static final int FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;
	public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;
	public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;
	
	public static final int COLOR_ATTACHMENT0 = 0x8CE0;
	public static final int DEPTH_ATTACHMENT = 0x8D00;
	public static final int STENCIL_ATTACHMENT = 0x8D20;
	public static final int DEPTH_STENCIL_ATTACHMENT = 0x821A;
	
	public static final int NONE = 0;
	
	public static final int FRAMEBUFFER_COMPLETE = 0x8CD5;
	public static final int FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;
	public static final int FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;
	public static final int FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 0x8CD9;
	public static final int FRAMEBUFFER_UNSUPPORTED = 0x8CDD;
	public static final int FRAMEBUFFER_BINDING = 0x8CA6;
	
	public static final int RENDERBUFFER_BINDING = 0x8CA7;
	public static final int MAX_RENDERBUFFER_SIZE = 0x84E8;
	
	public static final int INVALID_FRAMEBUFFER_OPERATION = 0x0506;
	
	/* WebGL-specific enums */
	public static final int UNPACK_FLIP_Y_WEBGL = 0x9240;
	public static final int UNPACK_PREMULTIPLY_ALPHA_WEBGL = 0x9241;
	public static final int CONTEXT_LOST_WEBGL = 0x9242;
}
