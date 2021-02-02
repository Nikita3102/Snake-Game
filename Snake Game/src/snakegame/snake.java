package snakegame;


import javax.swing.*;

public class snake extends JFrame{

    snake(){
        add(new board());
        pack();
        
        setLocationRelativeTo(null);
        setTitle("Snake Game");
        setResizable(false);
      
    }
    
    public static void main(String[] args){
        new snake().setVisible(true);
    }
}
