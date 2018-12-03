/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sdlc;

/**
 *
 * @author sadyk1876
 */
public class Notes extends javax.swing.JFrame {
    /**
     * Creates new form Notes
     */
    public Notes() {
        initComponents();
        
        //Declare sections attribute
        private String[][] sections;
    
        //Constructor one
        //Set sections to null
        public Notes(){
            sections = null;
        }
    
        //Constructor 2
        //Set sections to 2D parameter "s"
        public Notes(String[][] s){
            sections = s;
        }
    
        //Getter
        //Returns the note at the passed index
        public String getNote(int index){
            return sections[index][1];
        }
        
        //Returns title at the passed index
        public String getTitle(int index) {
            return sections[index][0];
        }
    
        //Setter
        //Sets the title and note of the the passed index
        public void setNote(int index, String title, String note){
            sections[index][0] = title;
            sections[index][1] = note;
        }
    }
    
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //Set the note object by calling the readNote method
        Notes note = readNote();
        //if user selects section 1
        if (cboxSections.getSelectedItem().equals("Section 1")) {
            //Display title and note of section 1
            txtNotesDisplay.setText(note.getTitle(0) + "\n\n" + note.getNote(0));
        }//if user selects section 2
        else if (cboxSections.getSelectedItem().equals("Section 2")) {
            //Display title and note of section 2
            txtNotesDisplay.setText(note.getTitle(1) + "\n\n" + note.getNote(1));
        }//if user selects section 3
        else if (cboxSections.getSelectedItem().equals("Section 3")) {
            //Display title and note of section 3
            txtNotesDisplay.setText(note.getTitle(2) + "\n\n" + note.getNote(2));
        }//if user selects section 4
        else if (cboxSections.getSelectedItem().equals("Section 4")) {
            //Display title and note of section 4
            txtNotesDisplay.setText(note.getTitle(3) + "\n\n" + note.getNote(3));
        }//if user selects section 5
        else if (cboxSections.getSelectedItem().equals("Section 5")) {
            //Display title and note of section 5
            txtNotesDisplay.setText(note.getTitle(4) + "\n\n" + note.getNote(4));
        }//else
        else {
            //Display title and note of section 6
            txtNotesDisplay.setText(note.getTitle(5) + "\n\n" + note.getNote(5));
        }


    }         

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
