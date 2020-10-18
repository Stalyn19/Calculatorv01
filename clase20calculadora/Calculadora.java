/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase20calculadora;

/**
 *
 * @author Stalyn Rosario
 */
public class Calculadora extends javax.swing.JFrame {

    private String operator;
    private double num1;
    private double num2;

    public String getOperador() {
        return operator;
    }

    public void setOperator(String operador) {
        this.operator = operador;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double op1) {
        this.num1 = op1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double op2) {
        this.num2 = op2;
    }

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScreen = new javax.swing.JPanel();
        screen = new javax.swing.JTextField();
        botton1 = new javax.swing.JButton();
        botton2 = new javax.swing.JButton();
        botton3 = new javax.swing.JButton();
        botton4 = new javax.swing.JButton();
        botton5 = new javax.swing.JButton();
        botton6 = new javax.swing.JButton();
        botton7 = new javax.swing.JButton();
        botton8 = new javax.swing.JButton();
        botton9 = new javax.swing.JButton();
        botton0 = new javax.swing.JButton();
        addition = new javax.swing.JButton();
        subtraction = new javax.swing.JButton();
        multiplication = new javax.swing.JButton();
        division = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        root = new javax.swing.JButton();
        pow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        equals = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPrime = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcu 2.0");
        setResizable(false);

        screen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                screenKeyPressed(evt);
            }
        });

        botton1.setText("1");
        botton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton1ActionPerformed(evt);
            }
        });

        botton2.setText("2");
        botton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton2ActionPerformed(evt);
            }
        });

        botton3.setText("3");
        botton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton3ActionPerformed(evt);
            }
        });

        botton4.setText("4");
        botton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton4ActionPerformed(evt);
            }
        });

        botton5.setText("5");
        botton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton5ActionPerformed(evt);
            }
        });

        botton6.setText("6");
        botton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton6ActionPerformed(evt);
            }
        });

        botton7.setText("7");
        botton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton7ActionPerformed(evt);
            }
        });

        botton8.setText("8");
        botton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton8ActionPerformed(evt);
            }
        });

        botton9.setText("9");
        botton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton9ActionPerformed(evt);
            }
        });

        botton0.setText("0");
        botton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton0ActionPerformed(evt);
            }
        });

        addition.setText("+");
        addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionActionPerformed(evt);
            }
        });

        subtraction.setText("-");
        subtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionActionPerformed(evt);
            }
        });

        multiplication.setText("X");
        multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationActionPerformed(evt);
            }
        });

        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        root.setText("SQRT");
        root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootActionPerformed(evt);
            }
        });

        pow.setText("POW");
        pow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powActionPerformed(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jButton1.setText("CE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPrime.setText("Prime");
        jPrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jScreenLayout = new javax.swing.GroupLayout(jScreen);
        jScreen.setLayout(jScreenLayout);
        jScreenLayout.setHorizontalGroup(
            jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(screen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jScreenLayout.createSequentialGroup()
                        .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pow, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                    .addGroup(jScreenLayout.createSequentialGroup()
                        .addGroup(jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jScreenLayout.createSequentialGroup()
                                .addComponent(botton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jScreenLayout.createSequentialGroup()
                                .addGroup(jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(subtraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(multiplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jScreenLayout.createSequentialGroup()
                                .addComponent(botton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(7, 7, 7)
                        .addGroup(jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jScreenLayout.createSequentialGroup()
                        .addComponent(clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPrime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jScreenLayout.setVerticalGroup(
            jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jScreenLayout.createSequentialGroup()
                        .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botton7)
                            .addComponent(botton8)
                            .addComponent(botton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botton4)
                            .addComponent(botton5)
                            .addComponent(botton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botton1)
                            .addComponent(botton2)
                            .addComponent(botton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botton0)
                            .addComponent(dot)
                            .addComponent(addition))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtraction)
                            .addComponent(multiplication)
                            .addComponent(division))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(root)
                            .addComponent(pow)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equals)
                    .addComponent(clear)
                    .addComponent(jButton1)
                    .addComponent(jPrime))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton1ActionPerformed
        // TODO add your handling code here:
        String result = screen.getText();
        result += "1";
        screen.setText(result);

    }//GEN-LAST:event_botton1ActionPerformed

    private void botton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton2ActionPerformed
        // TODO add your handling code here:
        String result = screen.getText();
        result += "2";
        screen.setText(result);
    }//GEN-LAST:event_botton2ActionPerformed

    private void botton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton3ActionPerformed
        // TODO add your handling code here:
        String result = screen.getText();
        result += "3";
        screen.setText(result);
    }//GEN-LAST:event_botton3ActionPerformed

    private void botton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton4ActionPerformed
        // TODO add your handling code here:
        String result = screen.getText();
        result += "4";
        screen.setText(result);
    }//GEN-LAST:event_botton4ActionPerformed

    private void botton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton5ActionPerformed
        // TODO add your handling code here:
        String resultado = screen.getText();
        resultado += "5";
        screen.setText(resultado);
    }//GEN-LAST:event_botton5ActionPerformed

    private void botton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton6ActionPerformed
        // TODO add your handling code here:
        String result = screen.getText();
        result += "6";
        screen.setText(result);
    }//GEN-LAST:event_botton6ActionPerformed

    private void botton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton7ActionPerformed
        // TODO add your handling code here:
        String result = screen.getText();
        result += "7";
        screen.setText(result);
    }//GEN-LAST:event_botton7ActionPerformed

    private void botton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton8ActionPerformed
        // TODO add your handling code here:
        String result = screen.getText();
        result += "8";
        screen.setText(result);
    }//GEN-LAST:event_botton8ActionPerformed

    private void botton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton9ActionPerformed
        // TODO add your handling code here:
        String result = screen.getText();
        result += "9";
        screen.setText(result);
    }//GEN-LAST:event_botton9ActionPerformed

    private void botton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton0ActionPerformed
        // TODO add your handling code here:
        String result = screen.getText();//Resultado igual al texto pantalla
        result += "0";//el resultado se guarda y se le agrega el numero del boton
        screen.setText(result);//en la pantalla se pone el resultado
    }//GEN-LAST:event_botton0ActionPerformed

    private void additionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionActionPerformed
        // TODO add your handling code here:
        this.opAddition();

    }//GEN-LAST:event_additionActionPerformed

    private void subtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractionActionPerformed
        // TODO add your handling code here:
        this.opSubtraction();
    }//GEN-LAST:event_subtractionActionPerformed

    private void multiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationActionPerformed
        // TODO add your handling code here:
        this.opMultiplication();
    }//GEN-LAST:event_multiplicationActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        // TODO add your handling code here:
        this.opDivicion();
    }//GEN-LAST:event_divisionActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        // TODO add your handling code here:
        this.opEquals();


    }//GEN-LAST:event_equalsActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        screen.setText("");
        // areaTexto.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void powActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powActionPerformed
        // TODO add your handling code here:
        this.opPow();
    }//GEN-LAST:event_powActionPerformed

    private void rootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootActionPerformed
        // TODO add your handling code here:
        this.opRoot();

    }//GEN-LAST:event_rootActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        // TODO add your handling code here:
        String resultado = screen.getText();
        resultado += ".";
        screen.setText(resultado);
    }//GEN-LAST:event_dotActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextArea.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void screenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_screenKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        switch (c) {
            case '+': {
                this.opAddition();
                break;
            }
            case '-': {
                this.opSubtraction();
                break;
            }
            case '*': {
                this.opMultiplication();
                break;
            }
            case '/': {
                this.opDivicion();
                break;
            }
            case '\n': {
                this.opEquals();
                break;
            }
            case '.': {
                String resultado = screen.getText();
                resultado += ".";
                screen.setText(resultado);
                break;
            }
        }
    }//GEN-LAST:event_screenKeyPressed

    private void jPrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrimeActionPerformed
        // TODO add your handling code here:
        this.opPrime();
    }//GEN-LAST:event_jPrimeActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    public void opAddition() {
        this.operator = "+";
        this.num1 = Double.valueOf(screen.getText());
        screen.setText("");
    }

    public void opSubtraction() {
        this.operator = "-";
        this.num1 = Double.valueOf(screen.getText());
        screen.setText("");
    }

    public void opMultiplication() {
        this.operator = "*";
        this.num1 = Double.valueOf(screen.getText());
        screen.setText("");
    }

    public void opDivicion() {
        this.operator = "/";
        this.num1 = Double.valueOf(screen.getText());
        screen.setText("");
    }

    public void opRoot() {
        Operations op = new Operations();
        this.operator = "r";
        this.num1 = Double.valueOf(screen.getText());
        double result = op.nthRoot(num1);
        screen.setText(op.isInt(result));
        jTextArea.append(op.isInt(result) + "\n");
    }

    public void opPow() {
        this.operator = "p";
        this.num1 = Double.valueOf(screen.getText());
        screen.setText("");
    }

    public void opPrime() {
        Operations op = new Operations();
        this.operator = "r";
        this.num1 = Integer.valueOf(screen.getText());
        String result = op.isPrime(num1);
        screen.setText(String.valueOf(num1));
        jTextArea.append(result + "\n");
    }

    public void opEquals() {//this method get both expresions and evaluate acordingly
        if (screen.getText().startsWith("+") || screen.getText().startsWith("-") || screen.getText().startsWith("*") || screen.getText().startsWith("/")) {
            screen.setText(screen.getText().substring(1, screen.getText().length()));
        }
        switch (this.operator) {
            case "p": {
                this.num2 = Double.valueOf(screen.getText());
                Operations op = new Operations();
                double resultado = op.exponentiation(num1, num2);
                screen.setText(op.isInt(resultado));
                jTextArea.append(op.isInt(resultado) + "\n");
                break;
            }
            case "+": {
                this.num2 = Double.valueOf(screen.getText());
                Operations op = new Operations();
                double resultado = op.addition(num1, num2);
                screen.setText(op.isInt(resultado));
                jTextArea.append(op.isInt(resultado) + "\n");
                break;
            }
            case "-": {
                this.num2 = Double.valueOf(screen.getText());
                Operations op = new Operations();
                double resultado = op.subtraction(num1, num2);
                screen.setText(op.isInt(resultado));
                jTextArea.append(op.isInt(resultado) + "\n");
                break;
            }
            case "*": {
                this.num2 = Double.valueOf(screen.getText());
                Operations op = new Operations();
                double resultado = op.multiplication(num1, num2);
                screen.setText(op.isInt(resultado));
                jTextArea.append(op.isInt(resultado) + "\n");
                break;
            }
            case "/": {
                this.num2 = Double.valueOf(screen.getText());
                Operations op = new Operations();
                double resultado = op.division(num1, num2);
                screen.setText(op.isInt(resultado));
                jTextArea.append(op.isInt(resultado) + "\n");
                break;
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addition;
    private javax.swing.JButton botton0;
    private javax.swing.JButton botton1;
    private javax.swing.JButton botton2;
    private javax.swing.JButton botton3;
    private javax.swing.JButton botton4;
    private javax.swing.JButton botton5;
    private javax.swing.JButton botton6;
    private javax.swing.JButton botton7;
    private javax.swing.JButton botton8;
    private javax.swing.JButton botton9;
    private javax.swing.JButton clear;
    private javax.swing.JButton division;
    private javax.swing.JButton dot;
    private javax.swing.JButton equals;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jPrime;
    private javax.swing.JPanel jScreen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JButton multiplication;
    private javax.swing.JButton pow;
    private javax.swing.JButton root;
    private javax.swing.JTextField screen;
    private javax.swing.JButton subtraction;
    // End of variables declaration//GEN-END:variables
}
