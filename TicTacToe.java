package kursovaya;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer; 
import javax.swing.JLabel;

public class TicTacToe extends javax.swing.JFrame {
    public static TicTacToe INSTANCE = null;
    public TicTacToe() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gamefield = new javax.swing.JTable();
        start_button = new javax.swing.JButton();
        but_menu = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        gamefield.setFont(gamefield.getFont().deriveFont(gamefield.getFont().getSize()+40f));
        gamefield.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gamefield.setColumnSelectionAllowed(true);
        gamefield.setFocusable(false);
        gamefield.setPreferredSize(new java.awt.Dimension(225, 180));
        gamefield.setRowHeight(60);
        gamefield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gamefieldMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gamefield);
        DefaultTableCellRenderer r = (DefaultTableCellRenderer)
        gamefield.getDefaultRenderer(String.class);
        r.setHorizontalAlignment(JLabel.CENTER);
        gamefield.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        start_button.setText("Computer begins");
        start_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_buttonActionPerformed(evt);
            }
        });

        but_menu.setText("Return to main menu");
        but_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(start_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but_menu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(start_button)
                    .addComponent(but_menu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tic-Tac-Toe game", jPanel2);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to  \"Tic-Tac-Toe\"\n\n Press \"Computer begins\" to  \nstart \nWARNING FIRST TURN GOES TO AI");
        jScrollPane2.setViewportView(jTextArea1);P

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Help", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int is_game_valid = 0;
    int stop_game=0;
    String[][] tic-tac=new String[3][3];
    
    private void start_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_buttonActionPerformed
        is_game_valid=1;
        stop_game=0;
        int x=gamefield.getColumnCount(), y=gamefield.getRowCount();
        reset(x,y);
 Random rand = new Random();
            int a,b, ctrl = 0;
                do
                {
                    a=rand.nextInt(3);
                    b=rand.nextInt(3);
                    if (" ".equals(tic-tac[a][b]))
                    {
                        tic-tac[a][b]="○";
                        ctrl=1;
                    }
                }while (ctrl != 1);
                set_field();
            
            
       
    }//GEN-LAST:event_start_buttonActionPerformed

  
    private void reset(int x, int y){
    
        for (int i=0;i < tic-tac.length; i++)
        {
            for(int j=0; j<tic-tac[i].length; j++)
            {
                tic-tac[i][j]= " ";
            }
        }
        set_field();
        //Обнуляем таблицу
        for (int i=0;i<x;i++)
        {
            for (int j=0;j<y;j++)
            {
                gamefield.setValueAt("", i, j);
            }
        }
    }

    private void set_field(){
   
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
               gamefield.setValueAt(tic-tac[i][j], i, j);
            }
        }
        
    }  
    private int checkLayers(){

        int C=0;
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
               if (" ".equals(tic-tac[i][j])) C=1;
            }
        }
        return C;
    }
    
    private void gamefieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gamefieldMouseClicked
  
        if (is_game_valid == 1)
        {
            int x=gamefield.getSelectedColumn(), y=gamefield.getSelectedRow();
            game(x,y);
        }
    }//GEN-LAST:event_gamefieldMouseClicked

    private void but_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_menuActionPerformed
      if (main.INSTANCE == null)
        {
            kursovaya.main.draw();
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_but_menuActionPerformed
    private void game(int x,int y){
        if (" ".equals(tic-tac[y][x]))//Если клетка пуста
        {
            tic-tac[y][x]="X";
            set_field();
            check_win("X",x,y);
          
            Random rand = new Random();
            int a,b, ctrl = 0;
            if (checkLayers()==1 && stop_game==0)
            {
                do
                {
                    a=rand.nextInt(3);
                    b=rand.nextInt(3);
                    if (" ".equals(tic-tac[a][b]))
                    {
                        tic-tac[a][b]="○";
                        ctrl=1;
                    }
                }while (ctrl != 1);
                set_field();
                check_win("○",b,a);
            }
           
        }
        if (stop_game==1)
        {
            is_game_valid=0;
        }
        else if(stop_game==0 && checkLayers()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Draw", "Draw", 1);
        }

    }
    
    private void check_win(String S,int x, int y){
        String buff="";
        for(int i=0;i<3;i++)
        {
            buff=buff+S;
        }
       
      
        String str="";
        for (int i=0;i<3;i++)
        {
            str=str+tic-tac[i][x];
            if (str.equals(buff))
            {
                if ("○".equals(S))
                    JOptionPane.showMessageDialog(rootPane, "AI wins", "Defeat", 1);
                else if ("X".equals(S))
                    JOptionPane.showMessageDialog(rootPane, "You winner", "Win", 1);
                stop_game=1; 
            }
           
        }
        str="";
        
        for (int i=0;i<3;i++)
        {
            str=str+tic-tac[y][i];
            if (str.equals(buff))
            {
                if ("○".equals(S))
                    JOptionPane.showMessageDialog(rootPane, "AI wins", "Defeat", 1);
                else if ("X".equals(S))
                    JOptionPane.showMessageDialog(rootPane, "You winner", "Win", 1);
                stop_game=1; 
            }
           // System.out.println("str "+str);
        }
        str="";
    
        if ((x==y || x==0&&y==2 || y==0&&x==2) && x!=1)
        {
            if (tic-tac[y][x].equals(tic-tac[1][1]))
            {
                if(tic-tac[y][x].equals(tic-tac[(1-y)+1][(1-x)+1]))
                {
                    if ("○".equals(S))
                    JOptionPane.showMessageDialog(rootPane, "AI wins", "", 1);
                    else if ("X".equals(S))
                    JOptionPane.showMessageDialog(rootPane, "You winner", "Победа", 1);
                    stop_game=1; 
                }
            }
        }
        else if (x==y && x==1) 
        {
            if((tic-tac[1][1].equals(tic-tac[0][0])&&tic-tac[1][1].equals(tic-tac[2][2]))||(tic-tac[1][1].equals(tic-tac[2][0])&&tic-tac[1][1].equals(tic-tac[0][2])))
              
            {
                    if ("○".equals(S))
                    JOptionPane.showMessageDialog(rootPane, "AI wins", "Defeat", 1);
                    else if ("X".equals(S))
                    JOptionPane.showMessageDialog(rootPane, "You win ", "Winner", 1);
                    stop_game=1; 
            }
        }
        buff="";
    }

    public static void draw(){
        
        java.awt.EventQueue.invokeLater(() -> {
            TicTacToe sframe = new TicTacToe();
            sframe.setLocationRelativeTo(null);
            sframe.setVisible(true);
        });
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new TicTacToe().setVisible(true);
        });
        gamefield.getTableHeader().setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_menu;
    private static javax.swing.JTable gamefield;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton start_button;
    // End of variables declaration//GEN-END:variables
}
