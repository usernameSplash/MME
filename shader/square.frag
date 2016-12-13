#version 430 core

in DATA
{
	vec2 tc;
} fs_in;

uniform sampler2D tex;
out vec4 color;

void main(void)
{
	color = texture(tex, fs_in.tc);
}