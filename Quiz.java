
package sdlc;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Quiz extends javax.swing.JFrame {
    NotesGUI mainWindow;
    Question[] questions;
    int index = 0;
    int correct = 0;
    public Quiz(NotesGUI m) {
        initComponents();
        questions = readFile();
        txtFinal.setText("");
        displayQuestion(questions[0]);
        mainWindow = m;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrp1 = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        lblq1 = new javax.swing.JLabel();
        btn1o1 = new javax.swing.JRadioButton();
        btn1o2 = new javax.swing.JRadioButton();
        btn1o3 = new javax.swing.JRadioButton();
        btn1o4 = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        txtResults = new javax.swing.JLabel();
        txtCorrect = new javax.swing.JLabel();
        txtScore = new javax.swing.JLabel();
        txtCorrectScore = new javax.swing.JLabel();
        txtTotalScore = new javax.swing.JLabel();
        txtError = new javax.swing.JLabel();
        txtFinal = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setText("Quiz Time!");

        lblq1.setText("Question 1");

        btngrp1.add(btn1o1);
        btn1o1.setText("Option 1");
        btn1o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1o1ActionPerformed(evt);
            }
        });

        btngrp1.add(btn1o2);
        btn1o2.setText("Option 2");

        btngrp1.add(btn1o3);
        btn1o3.setText("Option 3");

        btngrp1.add(btn1o4);
        btn1o4.setText("Option 4");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        txtResults.setText("Results");

        txtCorrect.setText("Correct answer:");

        txtScore.setText("Current Score:");

        txtCorrectScore.setText("Correct /");

        txtTotalScore.setText("Total");

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(title)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNext)
                                .addGap(51, 51, 51)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(192, 192, 192))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtScore)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCorrectScore)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTotalScore)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClose))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn1o3)
                                    .addComponent(txtResults)
                                    .addComponent(txtCorrect)
                                    .addComponent(btn1o1)
                                    .addComponent(btn1o4)
                                    .addComponent(btn1o2)
                                    .addComponent(lblq1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title)
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblq1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn1o1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn1o2)
                        .addGap(3, 3, 3)
                        .addComponent(btn1o3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn1o4)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNext)
                            .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtResults)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorrect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(txtScore)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorrectScore)
                            .addComponent(txtTotalScore)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1o1ActionPerformed
        
    }//GEN-LAST:event_btn1o1ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        int selected;
        if(btn1o1.isSelected() || btn1o2.isSelected() || btn1o3.isSelected() || btn1o4.isSelected()) {
            txtError.setText("");
            if(btn1o1.isSelected()) {
                selected = 0;
            }
            else if (btn1o2.isSelected()) {
                selected = 1;
            }
            else if (btn1o3.isSelected()) {
                selected = 2;
            }
            else {
                selected = 3;
            }
            if(selected == questions[index].getAnswerIndex()) {
                correct++;
            }
            if(index == 9) {
                closeWindow();
            }
            txtCorrect.setText("Correct answer: \n" + questions[index].getOptions()[questions[index].getAnswerIndex()]);
            index++;
            displayQuestion(questions[index]);
            txtTotalScore.setText("" + index);
            txtCorrectScore.setText(correct + "/"); 
            }          
            else {
                txtError.setText("Please select an option");
            }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        mainWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed
    public void closeWindow() {
        btn1o1.setVisible(false);
        btn1o2.setVisible(false);
        btn1o3.setVisible(false);
        btn1o4.setVisible(false);
        btnNext.setVisible(false);
        txtCorrect.setVisible(false);
        txtCorrectScore.setVisible(false);
        txtScore.setVisible(false);
        txtTotalScore.setVisible(false);
        txtError.setVisible(false);
        txtResults.setVisible(false);
        title.setVisible(false);
        lblq1.setVisible(false);
        txtFinal.setText("You have completed the quiz!\nYour final score is " + correct + "/10" + "\nClose this window to return to the notes");
    }
    public Question[] readFile() {
        Question[] qs = new Question[10];
        try {
            FileReader fr = new FileReader("src\\sdlc\\questions.txt");
            BufferedReader br = new BufferedReader(fr);
            String q = br.readLine();
            int counter = 0;
            while(q != null) {
                String option1 = br.readLine();
                String option2 = br.readLine();
                String option3 = br.readLine();
                String option4 = br.readLine();
                int answerIndex = Integer.parseInt(br.readLine());
                qs[counter] = new Question(q, option1, option2, option3, option4, answerIndex);
                q = br.readLine();
                counter++;
            }
        }
        catch(IOException e) {
            
        }
        return qs;
    }
    public void displayQuestion(Question q) {
        lblq1.setText(q.getQuestion());
        btn1o1.setText(q.getOptions()[0]);
        btn1o2.setText(q.getOptions()[1]);
        btn1o3.setText(q.getOptions()[2]);
        btn1o4.setText(q.getOptions()[3]);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn1o1;
    private javax.swing.JRadioButton btn1o2;
    private javax.swing.JRadioButton btn1o3;
    private javax.swing.JRadioButton btn1o4;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNext;
    private javax.swing.ButtonGroup btngrp1;
    private javax.swing.JLabel lblq1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel txtCorrect;
    private javax.swing.JLabel txtCorrectScore;
    private javax.swing.JLabel txtError;
    private javax.swing.JLabel txtFinal;
    private javax.swing.JLabel txtResults;
    private javax.swing.JLabel txtScore;
    private javax.swing.JLabel txtTotalScore;
    // End of variables declaration//GEN-END:variables
}