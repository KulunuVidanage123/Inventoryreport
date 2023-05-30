package packagehelp;

import java.awt.*;
import java.awt.event.*;
class ChoiceAction extends Frame
{
Choice c;
Label l;
    public ChoiceAction()
    {
   
    // Set frame properties
    setTitle("Choice with ItemListener Demo");
    setSize(400,400);
    setLayout(new FlowLayout());
    setLocationRelativeTo(null);
    setVisible(true);
   
    // Create choice
    c=new Choice();
   
    // Create label
    l=new Label();
   
    // Add items
    c.add("Flour pack 1kg");
    c.add("Vegetable oil iL");
    c.add("Keeri Samba 20kg");
    c.add("Canned chicken 400g");
    c.add("Canned fish 400g");
    c.add("Tomato sauce 400ml");
   
    // Add choice
    add(c);
   
    // Add label
    add(l);
   
    // Add item listener
    c.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent ie)
        {
        l.setText("You selected "+c.getSelectedItem());
        }
    });
   
    }
    public static void main(String[] args)
    {
    new ChoiceAction();
    }
}