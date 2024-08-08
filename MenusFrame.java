
package za.ac.tut.ui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenusFrame extends JFrame{
    
     private JMenuBar menuBar;
     private JMenu fileMenu;
     private JMenu editMenu;
     private JMenu viewMenu;
     private JMenu editorsViewSubMenu;
     private JMenu splitViewSubMenu;
     
     
     private JMenuItem newProjectMenuItem;
     private JMenuItem newFileMenuItem;
     private JMenuItem openProjectMenuItem;
     private JMenuItem openRecentProjectMenuItem;
     private JMenuItem closeAllProjectMenuItem;
     
     private JMenuItem undoMenuItem;
     private JMenuItem redoMenuItem;
     private JMenuItem cutMenuItem;
     private JMenuItem copyMenuItem;
     private JMenuItem pasteMenuItem;
     
     private JMenuItem sourceMenuItem;
     private JMenuItem horizontalMenuItem;
     private JMenuItem verticalMenuItem;
     private JMenuItem clearMenuItem;

    public MenusFrame() { 
        
        setTitle("Menu Frame");
        setSize(500,600);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        
        //Create a menu bar
        menuBar = new JMenuBar();
        
        //Create menus 
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        viewMenu = new JMenu("View");
        editorsViewSubMenu = new JMenu("Editors");
        splitViewSubMenu = new JMenu("Split");
        
        
        //file menu items 
        
        newProjectMenuItem = new JMenuItem("New Project...");
        newFileMenuItem = new JMenuItem("New File");
        openRecentProjectMenuItem = new JMenuItem("Open Project");
        openProjectMenuItem = new JMenuItem("Open Recent Project");
        closeAllProjectMenuItem = new JMenuItem("Close All Projects");
        
        
        // edit menu items
        undoMenuItem = new JMenuItem("Undo");
        redoMenuItem = new JMenuItem("Redo");
        cutMenuItem = new JMenuItem("Cut");
        copyMenuItem= new JMenuItem("Copy");
        pasteMenuItem = new JMenuItem("Paste");
        
        //view menu items 
        sourceMenuItem = new JMenuItem("Source");
        editorsViewSubMenu.add(sourceMenuItem);
        horizontalMenuItem = new JMenu("Horizontally");
        verticalMenuItem = new JMenu("Vertically");
        clearMenuItem = new JMenu("Clear");

        splitViewSubMenu.add(horizontalMenuItem);
        splitViewSubMenu.add(verticalMenuItem);
        splitViewSubMenu.add(clearMenuItem);
        
 
        //add file items to the menu
        fileMenu.add(newProjectMenuItem);
        fileMenu.add(newFileMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(openProjectMenuItem);
        fileMenu.add(openRecentProjectMenuItem);
        fileMenu.add(closeAllProjectMenuItem);
        
        //add edit items to the menu 
        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.addSeparator();
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        
        viewMenu.add(editorsViewSubMenu);
        viewMenu.add(splitViewSubMenu);

        //add menus to the bar 
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        
        //add the bar to the frame
        setJMenuBar(menuBar);
        
        setVisible(true);

     }
  
    
}
