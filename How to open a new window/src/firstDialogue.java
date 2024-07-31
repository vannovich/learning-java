import javax.swing.JOptionPane;

public class firstDialogue {
    public static void main(String[] args){
        // JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of something
//
//        JOptionPane.showMessageDialog(null,"This is some useless info","first Box", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Here is more useless info :D","first Box", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Really ?","first Box", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Your computer has a virus","first Box", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"call tech support now , else","first Box", JOptionPane.ERROR_MESSAGE);

        // int ans = JOptionPane.showConfirmDialog(null,"Bro, Do you code?", "This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
        //System.out.println(ans);
        //JOptionPane.showInputDialog("Whats your name");
        String[] response = {"No, you're awesome!","thank you!","*Blush"};
        JOptionPane.showOptionDialog(null,"Bro do you code","Name", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,response,0);
    }
}
