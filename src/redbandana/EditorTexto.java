package redbandana;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import redbandana.codigo;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EditorTexto extends javax.swing.JFrame {

    private DefaultTableModel model = new DefaultTableModel();

    private String[] columnNames = {"Numero", "Codigo", "Linha"};
    private ArrayList<JFrame> childs;

    String fileName = "";
    int i = 0;
    int erro_comentario = 0;
    int erro_literal = 0;
    int error = 0;
    int funcao = 0;
    int ver = 0;
    int lit = 0;
    String SintTrab = "";
    int nn1 = 0;
    int nn2 = 0;

    public EditorTexto() {
        initComponents();
        model.setColumnIdentifiers(columnNames);
        tabela.setModel(model);
        tabela.setSelectionMode(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        SintTable = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuNovo = new javax.swing.JMenuItem();
        jMenuAbrir = new javax.swing.JMenuItem();
        jMenuSalvar = new javax.swing.JMenuItem();
        jMenuSalvarComo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuSair = new javax.swing.JMenuItem();
        jMenuExecutar = new javax.swing.JMenu();
        Executar = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RedBandana Compiler");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabela);

        SintTable.setColumns(20);
        SintTable.setRows(5);
        jScrollPane3.setViewportView(SintTable);

        jMenuBar1.setForeground(new java.awt.Color(255, 51, 51));

        jMenuFile.setText("Arquivo");

        jMenuNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuNovo.setText("Novo");
        jMenuNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNovoActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuNovo);

        jMenuAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuAbrir.setText("Abrir");
        jMenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbrirActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuAbrir);

        jMenuSalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuSalvar.setText("Salvar");
        jMenuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalvarActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuSalvar);

        jMenuSalvarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuSalvarComo.setText("Salvar Como");
        jMenuSalvarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalvarComoActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuSalvarComo);
        jMenuFile.add(jSeparator1);

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuSair);

        jMenuBar1.add(jMenuFile);

        jMenuExecutar.setText("Executar");

        Executar.setText("Executar");
        Executar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecutarActionPerformed(evt);
            }
        });
        jMenuExecutar.add(Executar);

        jMenuBar1.add(jMenuExecutar);

        jMenuSobre.setText("Sobre");

        jMenuAbout.setText("Sobre o editor");
        jMenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAboutActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuAbout);

        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNovoActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_jMenuNovoActionPerformed

    private void jMenuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAbrirActionPerformed
        javax.swing.JFileChooser jc = new javax.swing.JFileChooser();
        jc.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("*.txt", "txt"));
        jc.showOpenDialog(this);
        fileName = jc.getSelectedFile().toString();
        if (!fileName.endsWith(".txt")) {
            fileName += ".txt";
        }
        try {
            FileReader reader = null;
            try {
                reader = new FileReader(fileName);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            BufferedReader br = new BufferedReader(reader);
            jTextArea1.read(br, null);
            br.close();
            jTextArea1.requestFocus();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jMenuAbrirActionPerformed

    private void jMenuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalvarActionPerformed
        if (!fileName.equals("")) {
            save();
            return;
        }
        saveAs();
    }//GEN-LAST:event_jMenuSalvarActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuSalvarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalvarComoActionPerformed
        saveAs();
    }//GEN-LAST:event_jMenuSalvarComoActionPerformed

    private void jMenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAboutActionPerformed
        Sobre sobre = new Sobre();
        sobre.setTitle("Compilador RedBandana");
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuAboutActionPerformed

    private void ExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecutarActionPerformed
        model.setRowCount(0);
        i = 0;
        erro_comentario = 0;
        erro_literal = 0;
        error = 0;
        funcao = 0;
        ver = 0;
        lit = 0;
        SintTrab = "48 44";
        SintTable.setText("48 44");
        nn1 = 0;
        nn2 = 0;
        
        
        new Thread(() -> {
            compiler();
        }).start();

    }//GEN-LAST:event_ExecutarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorTexto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Executar;
    private javax.swing.JTextArea SintTable;
    private javax.swing.JMenuItem jMenuAbout;
    private javax.swing.JMenuItem jMenuAbrir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuExecutar;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuNovo;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JMenuItem jMenuSalvar;
    private javax.swing.JMenuItem jMenuSalvarComo;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void saveAs() {
        javax.swing.JFileChooser jc = new javax.swing.JFileChooser();
        jc.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("*.txt", "txt"));
        jc.showSaveDialog(this);
        fileName = jc.getSelectedFile().toString();
        if (!fileName.endsWith(".txt")) {
            fileName += ".txt";
        }
        save();
    }

    private void save() {
        try {
            java.io.FileOutputStream out = new java.io.FileOutputStream(fileName, false);
            out.write(jTextArea1.getText().getBytes());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private int tokenSymbolV(char tok) {

        switch (tok) {
            case '@': {
                System.out.println("Abre @");
                return 98;
            }
            case '#': {
                System.out.println("Comentario 1");
                return 97;
            }
            case '+': {
                System.out.println("é mais 34");
                return 34;
            }
            case '-': {
                return 47;
            }
            case '=': {
                return 29;
            }
            case '>': {
                System.out.println("é cout 25");
                return 27;
            }
            case '<': {
                return 32;
            }
            case '{': {
                return 36;
            }
            case '}': {
                return 35;
            }
            case '(': {
                return 42;
            }
            case ')': {
                return 43;
            }
            case ':': {
                return 38;
            }
            case ';': {
                return 37;
            }
            case '/': {
                return 39;
            }
            case '*': {
                return 41;
            }
        }
        return -1;
    }

    private int tokenSymbolV(char tok, char tok2) {

        switch (tok) {
            case '@': {

                return 97;
            }
            case '#': {

                return 98;
            }

            case '+': {
                if (tok2 == '+') {
                    System.out.println("é mais mais 33");

                    return 33;
                } else {
                    System.out.println("é mais  34");
                    return 34;
                }
            }
            case '-': {
                if (tok2 == '-') {
                    System.out.println("é menos menos");

                    return 46;

                }
                System.out.println(" é menos");
                return 47;

            }
            case '=': {
                if (tok2 == '=') {

                    return 28;
                }
                return 29;
            }
            case '>': {
                if (tok2 == '>') {
                    System.out.println("é cout 25");

                    return 25;

                }
                if (tok2 == '=') {
                    System.out.println("é maior igual 26");

                    return 26;

                } else {
                    System.out.println("é maior 27");

                    return 27;
                }
            }
            case '<': {
                if (tok2 == '<') {
                    System.out.println("é cin 31");

                    return 31;

                }
                if (tok2 == '=') {
                    System.out.println("é menor igual 30");

                    return 30;
                } else {
                    System.out.println("é menor 32");
                    return 32;

                }
            }

        }
        return -1;
    }

    private int tokenSymbol(char tok) {

        switch (tok) {
            case '@': {
                System.out.println("Abre @");
                funcao++;
                break;
            }
            case '#': {
                System.out.println("Comentario 1");
                erro_comentario++;
                break;
            }
            case '%': {
                System.out.println("LITERAL");
                lit++;
                break;
            }

            case '"': {
                System.out.println("ASPAS");
                erro_literal++;
                break;
            }

            case '+': {
                System.out.println("é mais 34");
                break;
            }

            case '-': {

            }

            case '=': {

                break;
            }

            case '>': {
                System.out.println("é cout 25");
                break;
            }

            case '<': {

                break;

            }

        }
        return -1;
    }

    private int tokenSymbol(char tok, char tok2) {
        if (erro_comentario % 2 == 0) {
            if (tok == '#') {
                erro_comentario++;

                return -1;

            }

        }
        switch (tok) {
            case '@': {
                funcao++;
                return -1;
            }
            case '#': {
                erro_comentario++;
                return -1;
            }
            case '"': {
                System.out.println("ASPAS");
                erro_literal++;
                break;
            }

            case '+': {
                if (tok2 == '+') {
                    System.out.println("é mais mais 33");
                    i++;
                    return 33;

                }
                System.out.println("é mais  34");
                return 34;
            }
            case '-': {
                if (tok2 == '-') {
                    System.out.println("é menos menos");
                    i++;
                    return 46;

                }
                System.out.println(" é menos");
                return 47;

            }
            case '=': {
                if (tok2 == '=') {
                    i++;
                    return 28;
                }
                return 29;
            }
            case '>': {
                if (tok2 == '>') {
                    System.out.println("é cout 25");
                    i++;
                    return 25;

                }
                if (tok2 == '=') {
                    System.out.println("é maior igual 26");
                    i++;
                    return 26;

                } else {
                    System.out.println("é maior 27");

                    return 27;
                }
            }
            case '<': {
                if (tok2 == '<') {
                    System.out.println("é cin 31");
                    i++;
                    return 31;

                }
                if (tok2 == '=') {
                    System.out.println("é menor igual 30");
                    i++;
                    return 30;
                } else {
                    System.out.println("é menor 32");
                    return 32;

                }
            }

        }
        return -1;
    }

    private int tokenword(String palavra) {
        switch (palavra) {
            case "while": {
                System.out.println("é while 1");
                return 1;
            }
            case "void": {
                System.out.println("é void 2");
                return 2;
            }
            case "return": {
                System.out.println("é return 4");
                return 4;
            }
            case "string": {

                return 3;
            }
            case "main": {
                return 10;
            }
            case "inicio": {
                return 13;
            }
            case "fim": {
                return 18;
            }
            case "if": {
                return 14;
            }
            case "for": {
                return 16;
            }
            case "do": {
                return 20;
            }
            case "else": {
                return 19;
            }
            case "cout": {
                return 21;
            }
            case "char": {
                return 23;
            }
            case "cin": {
                return 22;
            }
            case "callfuncao": {
                return 24;
            }
            case "float": {
                return 17;
            }
            case "integer": {
                return 12;
            }
        }
        if (erro_literal % 2 != 0) {
            return 11;
        }
        if (ver == 1) {
            return 7;
        }
        if (ver == 2) {
            return 9;
        }
        if (ver == 3) {
            return 11;
        }
        return 999;
    }

    private void imp(char[] ch) {
        for (int x = 0; x < ch.length; x++) {
            System.out.println("É Numero: " + ch[x]);
        }

    }

    private void compiler() {
        String compiler = jTextArea1.getText();
        tabela.setModel(model);

        char[] ch = compiler.toCharArray();
        int somaespa = 0;
        imp(ch);
        for (i = 0; i < ch.length; i++) {
            codigo cod = new codigo();

            if (Character.isDigit(ch[i]) && erro_comentario % 2 == 0) {
                if (erro_literal % 2 != 0) {
                    model.setRowCount(0);
                    JOptionPane.showMessageDialog(null, "ERRO! NUMERO: " + ch[i] + " na linha: " + retornalinha(compiler, i) + " NÃO É LITERAL", "ERRO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                if (i + 1 < ch.length) {
                    if (Character.isLetter(ch[i + 1])) {
                        JOptionPane.showMessageDialog(null, "ERRO! TOKEN : " + ch[i] + ch[i + 1] + " na linha: " + retornalinha(compiler, i) + " NÃO É RECONHECIDO", "ERRO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
                        error++;
                        break;
                    }
                }

                System.out.println("É Numero");
                String j = "";
                char somachar = ch[i];
                int vervirgula = 0;

                for (int v = i; v < ch.length; v++) {
                    if (Character.isDigit(ch[v]) || ch[v] == ',') {
                        if (ch[v] == ',') {
                            vervirgula = 1;
                        }
                        j = j.concat(Character.toString(ch[v]));
                        i++;
                        if (v + 1 < ch.length) {
                            if (Character.isLetter(ch[v])) {
                                JOptionPane.showMessageDialog(null, "ERRO! TOKEN: " + ch[i] + ch[i + 1] + " na linha: " + retornalinha(compiler, i) + " NÃO É RECONHECIDO", "ERRO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
                                error++;
                                break;
                            }
                        }

                    } else {
                        i--;
                        break;
                    }
                }
                if (vervirgula == 0) {
                    cod.setLinha(retornalinha(compiler, i + 1));
                    cod.setNumero(5); //Numero Inteiro
                    cod.setCod(j);

                    model.addRow(new Object[]{cod.getNumero(), cod.getCod(), cod.getLinha()});
                } else {
                    cod.setLinha(retornalinha(compiler, i + 1));
                    cod.setNumero(6); //Numero Float
                    cod.setCod(j);

                    model.addRow(new Object[]{cod.getNumero(), cod.getCod(), cod.getLinha()});
                }
                System.out.println("" + j);

            } else if (Character.isLetter(ch[i]) && erro_comentario % 2 == 0 || ch[i] == '$' || ch[i] == '"' || ch[i] == '%') {
                ver = 0;
                if (ch[i] == '$') {
                    ver = 1;
                }
                if (ch[i] == '"') {
                    System.out.println("T" + erro_literal);
                    tokenSymbol(ch[i]);
                    System.out.println("X" + erro_literal);
                    ver = 2;
                }
                if (ch[i] == '%') {
                    tokenSymbol(ch[i]);
                    ver = 3;
                }
                System.out.println("É caracter alfabetico");
                String j = "";

                if (i + 1 < ch.length) {
                    if (Character.isDigit(ch[i])) {
                        JOptionPane.showMessageDialog(null, "ERRO! TOKxEN: " + ch[i] + " na linha: " + retornalinha(compiler, i) + " NÃO É RECONHECIDO", "ERRO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
                        error++;
                        break;
                    }
                }

                for (int v = i; v < ch.length; v++) {
                    if (Character.isLetter(ch[v]) || ch[v] == '$' || ch[v] == '"' || ch[v] == '%') {
                        if (v + 1 < ch.length) {
                            if (ch[v + 1] == '"') {
                                tokenSymbol(ch[v + 1]);
                                System.out.println("pa" + erro_literal);
                            }
                            if (ch[v + 1] == '%') {
                                tokenSymbol(ch[v + 1]);

                            }
                        }

                        j = j.concat(Character.toString(ch[v]));
                        i++;

                    } else {
                        break;
                    }
                    if (i + 1 < ch.length) {
                        if (Character.isDigit(ch[i])) {
                            JOptionPane.showMessageDialog(null, "ERRO! TOKEN: " + ch[i] + ch[i + 1] + " na linha: " + retornalinha(compiler, i) + " NÃO É RECONHECIDO", "ERRO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
                            error++;
                            break;
                        }
                    }

                }

                if (j.length() == 1) {
                    System.out.println("CHAR" + j);

                    cod.setLinha(retornalinha(compiler, i + 1));
                    cod.setNumero(8);
                    cod.setCod(j);
                    if (erro_literal % 2 != 0) {

                    } else {
                        JOptionPane.showMessageDialog(null, "ERRO! TOKEN " + ch[i - 1] + " NÃO ENCONTRADO, LINHA " + retornalinha(compiler, i) + "", "ERRO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
                        error++;

                        model.addRow(new Object[]{cod.getNumero(), cod.getCod(), cod.getLinha()});

                    }

                } else {
                    System.out.println("STRING" + j);

                    cod.setLinha(retornalinha(compiler, i + 1));
                    cod.setNumero(tokenword(j));
                    cod.setCod(j);

                    if (erro_literal % 2 != 0 || tokenword(j) == 999) {
                        error++;
                        JOptionPane.showMessageDialog(null, "ERRO! TOKEN " + j + " NÃO ENCONTRADO", "ERRO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
                    } else {
                        model.addRow(new Object[]{cod.getNumero(), cod.getCod(), cod.getLinha()});

                    }

                }
                i--;
            } else {

                char k = 'o';
                k = ch[i];

                if (k == ' ' && erro_comentario % 2 == 0) {

                    if (erro_literal % 2 != 0) {
                        model.setRowCount(0);
                        JOptionPane.showMessageDialog(null, "ERRO! ESPAÇO NA LINHA" + i + "NÃO É LITERAL", "ERRO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
                        error++;
                    }

                    System.out.println("É espaço");
                    cod.setLinha(retornalinha(compiler, i + 1));
                    cod.setNumero(99);
                    cod.setCod("[ESPAÇO]");
                    // model.addRow(new Object[]{cod.getNumero(), cod.getCod(), cod.getLinha()});

                } else if (k == '\n') {
                    System.out.println("é quebra linha");
                    cod.setLinha(retornalinha(compiler, i + 1));
                    cod.setNumero(99);
                    cod.setCod("[QUEBRA LINHA]");
                    model.addRow(new Object[]{cod.getNumero(), cod.getCod(), cod.getLinha()});
                } else {
                    System.out.println("É especial");
                    System.out.println(">>>" + ch[i]);
                    if (Character.isDigit(ch[i]) || Character.isLetter(ch[i])) {
                        System.out.println("ha");
                    } else {
                        int aux = -1;
                        if (i + 1 < ch.length) {
                            if (ch[i + 1] != '\n') {
                                aux = i + 1;
                            }
                        }

                        if (aux != -1) {
                            System.out.println("VALO 1:" + i);
                            int aux1 = 0;
                            aux1 = i;
                            tokenSymbol(ch[i], ch[aux]);

                            System.out.println("Entrou aq");

                            if (erro_literal % 2 != 0 && ch[i] != '"') {
                                model.setRowCount(0);
                                JOptionPane.showMessageDialog(null, "ERRO! SIMBOLO NÃO É LITERAL", "ERRO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
                                error++;
                            }
                            if (i == aux1 && !Character.isDigit(i)) {
                                System.out.println("ENTROU AQUI");
                                cod.setLinha(retornalinha(compiler, i + 1));
                                cod.setNumero(tokenSymbolV(ch[i]));
                                String j = "" + ch[i];
                                cod.setCod(j);
                                if (ch[i] == '@' || ch[i] == '#') {

                                } else {
                                    model.addRow(new Object[]{cod.getNumero(), cod.getCod(), cod.getLinha()});
                                }

                            } else if (!Character.isDigit(i)) {
                                cod.setLinha(retornalinha(compiler, i + 1));
                                cod.setNumero(tokenSymbolV(ch[i - 1], ch[i]));
                                String j = "" + ch[i - 1] + ch[i] + "";
                                System.out.println("ENTROU AQUI2");
                                cod.setCod(j);

                                model.addRow(new Object[]{cod.getNumero(), cod.getCod(), cod.getLinha()});
                            }
                        } else if (!Character.isDigit(i)) {
                            tokenSymbol(ch[i]);
                            System.out.println("Entrou");
                            if (erro_literal % 2 != 0 && ch[i] != '"') {
                                model.setRowCount(0);
                                JOptionPane.showMessageDialog(null, "ERRO! SIMBOLO NÃO É LITERAL", "ERRO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
                                error++;
                            }
                            cod.setLinha(retornalinha(compiler, i + 1));
                            cod.setNumero(tokenSymbolV(ch[i]));
                            String j = "" + ch[i];
                            cod.setCod(j);
                            if (ch[i] == '@' || ch[i] == '#') {

                            } else {
                                model.addRow(new Object[]{cod.getNumero(), cod.getCod(), cod.getLinha()});
                            }
                        }

                    }
                }
            }
            if (funcao != 0) {
                System.out.println("FUNCAO MASSA");
                i = retornalinha2(compiler, i);

                funcao = 0;
            }
            /* SINTATICO A PARTIR DESSA LINHA */
             try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("");
            }
            if (cod.getNumero() != 99 && SintTrab.substring(0, 2).trim() != "43" ) {
                String aux = cod.getNumero() + " ";
                int A = cod.getNumero();
                String X1 = SintTrab.substring(0, 2).trim();
                /*NUMERO NO TOPO DA PILHA*/ int X = Integer.parseInt(X1.trim());

                System.out.println("X> TOPO " + X);

                //SintTrab = aux + SintTrab;
                System.out.println("A > Chegou " + A);
                /*Numero que que está entrando*/
                int veff = 0;
                int veff2 = 0;
                while(X >= 48 && veff ==0) {
                    FunçãoMatriz fm = new FunçãoMatriz();
                    int x = fm.Parsing(X, A);
                    if(x == 999){
                        error++;
                        JOptionPane.showMessageDialog(null, "ERRO! SINTATICO " +cod.getCod()+ " Não é reconhecido", "ERRO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
                    }
                    if (SintTrab.length() > 2) {
                            SintTrab = SintTrab.substring(2);
                        }
                    SintTrab = ltrim(SintTrab);
                    String add = fm.returnCodes(x);
                    if(add.isEmpty()){
                        System.out.println("BYUY");
                        X1 = SintTrab.substring(0, 2).trim();
                /*NUMERO NO TOPO DA PILHA*/ X = Integer.parseInt(X1.trim());
                veff2++;
                    }
                    else {
                    System.out.println("MASSA CARA: " + x);
                    SintTrab = add + SintTrab;
                     X1 = SintTrab.substring(0, 2).trim();
                /*NUMERO NO TOPO DA PILHA*/ X = Integer.parseInt(X1.trim());
                veff++;
                    }
                }
                X1 = SintTrab.substring(0, 2).trim();
                /*NUMERO NO TOPO DA PILHA*/ X = Integer.parseInt(X1.trim());
                if(X == 15){
                    if (SintTrab.length() > 2) {
                            SintTrab = SintTrab.substring(2);
                        }

                        SintTrab = ltrim(SintTrab);
                }
                X1 = SintTrab.substring(0, 2).trim();
                /*NUMERO NO TOPO DA PILHA*/ X = Integer.parseInt(X1.trim());
                /* */
                if (X < 48) {
                    if (X == A) {
                        if (SintTrab.length() > 2) {
                            SintTrab = SintTrab.substring(2);
                        }
                    

                        SintTrab = ltrim(SintTrab);

                    } else {
                      
                    }
                }
                SintTable.setText(SintTrab);

            }
            // * FUNÇÃO Para pausas aqui
           
        }

        codigo cod = new codigo();
        if (i == 1000) {
            i = ch.length;
            System.out.println("tu");
        }
        cod.setLinha(retornalinha(compiler, i));
        cod.setNumero(44);
        cod.setCod("[FINAL]");
        model.addRow(new Object[]{cod.getNumero(), cod.getCod(), cod.getLinha()});
        System.out.println("" + erro_comentario);

        if (erro_comentario % 2 != 0) {
            model.setRowCount(0);
            JOptionPane.showMessageDialog(null, "ERRO! NÃO FOI FECHADO COMENTARIO", "ERRO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
        }
        if (erro_literal % 2 != 0) {
            model.setRowCount(0);
            JOptionPane.showMessageDialog(null, "ERRO! ASPAS NÃO FORAM FECHADAS OU LITERAL COM TIPO INVALIDO", "ERRO ENCONTRADO", JOptionPane.ERROR_MESSAGE);

        }
        if (error != 0) {
            model.setRowCount(0);
            SintTable.setText("");
        }
    }

    private void error() {

        JOptionPane.showMessageDialog(null, "d");
    }

    public static String ltrim(String s) {
        int i = 0;
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        return s.substring(i);
    }

    private int retornalinha2(String comp, int pos) {
        char[] letras = comp.toCharArray();
        codigo cod = new codigo();
        int nlinhas = 0;
        int tam = comp.length();

        for (int tax = pos; tax < tam; tax++) {
            char jc = 'o';

            jc = letras[tax];

            if (jc == '\n') {
                System.out.println("POS> " + tax);
                return tax;

            }

        }

        return 999;
    }

    private int retornalinha(String comp, int pos) {
        char[] letras = comp.toCharArray();
        codigo cod = new codigo();
        int nlinhas = 0;

        for (int x = 0; x < pos - 1; x++) {
            char jc = 'o';

            jc = letras[x];

            if (jc == '\n') {

                nlinhas++;
                System.out.println("SOMOU" + nlinhas);
            }

        }

        return nlinhas + 1;

    }
}
