/*
 *  Masfia Kader
    Nov. 28/2018
    This GUI program displays the selected notes sections of a note datafile .
 */
package sdlc;
import java.io.*;

public class NotesGUI extends javax.swing.JFrame {
    private Quiz secondWindow;
    /**
     * This method reads in the notes title and store them in a two dimensional
     * array and sets the read notes to a Notes object
     *
     * @return the set Notes object
     */
    public static Notes readNote() {
        //Declare the note object
        Notes note;
        //Declare the note array
        String[][] aNote = new String[6][2];
        //Try to find datafile
        try {
            //Set file and buffered reader
            FileReader fr = new FileReader("src\\sdlc\\notefile.txt");
            BufferedReader br = new BufferedReader(fr);
            //Loop 6 times and read in the title and note
            for (int i = 0; i < 6; i++) {
                //Title
                aNote[i][0] = br.readLine();
                //Note
                aNote[i][1] = br.readLine();
            }
        }//Catch if file reader was not found and print out error 
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
        //Set the Notes object with the array note
        note = new Notes(aNote);
        //return note object
        return note;
    }

    public NotesGUI() {
        initComponents();
        sections = null;
    }

    //Declare sections attribute
    public String[][] sections;

    //Getter
    //Returns the note at the passed index
    public String getNote(int index) {
        return sections[index][1];
    }

    //Returns title at the passed index
    public String getTitle(int index) {
        return sections[index][0];
    }

    //Setter
    //Sets the title and note of the the passed index
    public void setNote(int index, String title, String note) {
        sections[index][0] = title;
        sections[index][1] = note;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNotes = new javax.swing.JLabel();
        cboxSections = new javax.swing.JComboBox<String>();
        btnQuiz = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotesDisplay = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNotes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNotes.setText("Notes");

        cboxSections.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Section 1", "Section 2", "Section 3", "Section 4", "Section 5", "Section 6" }));

        btnQuiz.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuiz.setText("Quiz");
        btnQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        txtNotesDisplay.setColumns(20);
        txtNotesDisplay.setLineWrap(true);
        txtNotesDisplay.setRows(5);
        jScrollPane1.setViewportView(txtNotesDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboxSections, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSubmit)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxSections, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
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


    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
        if(secondWindow == null) {
            secondWindow = new Quiz(this);
        }
        secondWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQuizActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuiz;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cboxSections;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNotes;
    private javax.swing.JTextArea txtNotesDisplay;
    // End of variables declaration//GEN-END:variables
}
