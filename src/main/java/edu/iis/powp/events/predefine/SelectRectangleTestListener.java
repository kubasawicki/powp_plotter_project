package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.DrawRectangle;

public class SelectRectangleTestListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
        DrawRectangle.drawrectangle(0,0,100,100).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
