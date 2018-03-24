package edu.iis.powp.command;

import java.util.ArrayList;

public class DrawRectangle {
		public static ComplexCommand drawrectangle(int X, int Y, int width, int height) {
			ArrayList<PlotterCommand> commands = new ArrayList<PlotterCommand>();
				commands.add(new CommandSetPosition(X,Y));
				commands.add(new CommandDrawLineToPosition(X+width,Y));
				commands.add(new CommandDrawLineToPosition(X+width,Y+height));
				commands.add(new CommandDrawLineToPosition(X,Y+height));
				commands.add(new CommandDrawLineToPosition(X,Y));
			return new ComplexCommand(commands);	
	}
}