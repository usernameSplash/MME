package Game.Level;

import Game.GameInfo;
import Graphics.Texture;
import Graphics.TextureManager;
import Graphics.VertexArray;
import Maths.Matrix4f;

public class Title implements Level{
	private VertexArray m_Background;
	private Texture m_BackgroundT;
	private Matrix4f m_bgMatrix;
	
	public Title() {
		//m_BackgroundT = TextureManager.loadTexture(GameInfo.TITLE_BG_PATH);
		m_BackgroundT = new Texture(GameInfo.TITLE_BG_PATH);
		m_Background = new VertexArray(m_BackgroundT.getWidth(), 1080.0f, 0.0f, 1.0f, 0.0f, 1.0f);
		m_bgMatrix = Matrix4f.translate(960, 520, 0);
	}
	
	@Override
	public void draw() {
		m_BackgroundT.bind();
		m_Background.draw(m_bgMatrix);
	}
	
	@Override
	public void update(double deltaTime) {
		
	}
	
	@Override
	public void keyPressEvent(int key) {
		
	}

	@Override
	public void keyReleaseEvent(int key) {
		
	}

	@Override
	public void mousePressEvent(int button) {
		
	}

	@Override
	public void mouseReleaseEvent(int button) {
		
	}
}