package pokemon.view;

import javax.swing.JFrame;

import pokemon.controller.PokemonController;
import pokemon.view.PokemonPanel;

public class PokemonFrame 
{
	public class PokemonFrame extends JFrame
	{
		private PokemonController baseController;
		private PokemonPanel firstPanel;
		
	 
		public PokemonFrame(PokemonController baseController)
		{
			super();
			this.setBaseController(baseController);
			firstPanel = new ChatPanel(baseController);
			
			setupFrame();
		}
		

		private void setupFrame()
		{
			this.setContentPane(firstPanel);
			this.setTitle("Pokemon");
			this.setSize(500, 400);
			this.setResizable(false);
			this.setVisible(true);
		}
		
		public PokemonController getBaseController()
		{
			return baseController;
		}
		
		public void setBaseController(PokemonController baseController)
		{
			this.baseController = baseController;
		}
}
