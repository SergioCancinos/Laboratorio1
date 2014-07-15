/*
	Sergio Cancinos 13062
	Johnny del Cid 13032
        Ana Bartra 13643
	
	IntG.java
	Se encarga de crear la interfaz gr�fica con la cual interactua el usuario mostrando los diferentes elementos de dicha clase. 
 */

/*package com.toy.anagrams.lib;*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class IntG extends javax.swing.JFrame {
	private Radio misComandos;

    /** Creates new form IntG */
    public IntG() {
        initComponents();
		misComandos = new miRadio();
		
    }
    @SuppressWarnings("unchecked")
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton17 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton17.setText("jButton17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("AM/FM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ON/OFF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("3");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("4");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("5");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("6");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("7");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("8");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("9");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("10");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("11");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("12");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel1.setText("RADIO LOL");

        jButton15.setText("Anterior");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Siguiente");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel2.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton15)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton16))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jLabel2)
                    .addComponent(jButton16)))
        );

        pack();
    }// </editor-fold>
	//ON/OFF

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {		

		misComandos.encendidoApagado();
		if (misComandos.getEstado()== true){
			jButton1.setEnabled(true);
			jButton3.setEnabled(true);
			jButton4.setEnabled(true);
			jButton5.setEnabled(true);
			jButton6.setEnabled(true);
			jButton7.setEnabled(true);
			jButton8.setEnabled(true);
			jButton9.setEnabled(true);
			jButton10.setEnabled(true);
			jButton11.setEnabled(true);
			jButton12.setEnabled(true);
			jButton13.setEnabled(true);
			jButton14.setEnabled(true);
			jButton15.setEnabled(true);
			jButton16.setEnabled(true);
			jButton17.setEnabled(true);	
			jLabel2.setText("Encendido ");
		}
		else{
			jButton1.setEnabled(false);
			jButton3.setEnabled(false);
			jButton4.setEnabled(false);
			jButton5.setEnabled(false);
			jButton6.setEnabled(false);
			jButton7.setEnabled(false);
			jButton8.setEnabled(false);
			jButton9.setEnabled(false);
			jButton10.setEnabled(false);
			jButton11.setEnabled(false);
			jButton12.setEnabled(false);
			jButton13.setEnabled(false);
			jButton14.setEnabled(false);
			jButton15.setEnabled(false);
			jButton16.setEnabled(false);
			jButton17.setEnabled(false);	
			jLabel2.setText("Apagado");			
		}
    }	
	//AM/FM
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		misComandos.cambiarFrecuencia();
		if(misComandos.getFrecuencia()==true){
			jButton1.setText("AM");
		}
		else{
			jButton1.setText("FM");
		}
		
    }
	//1
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel2.setText(misComandos.getEstacionesFav()[1]);
		if(misComandos.getEstacionesFav()[1]==null){
			misComandos.guardarEstacion(misComandos.getEstacion(),1);
			JOptionPane.showMessageDialog(null,"Su Estaci�n se Guardo Correctamente.");
		}
		
    }
	//2
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
	jLabel2.setText(misComandos.getEstacionesFav()[2]);
		if(misComandos.getEstacionesFav()[2]==null){
			misComandos.guardarEstacion(misComandos.getEstacion(),2);
			JOptionPane.showMessageDialog(null,"Su Estaci�n se Guardo Correctamente.");
		}
    }
	//3
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
	jLabel2.setText(misComandos.getEstacionesFav()[3]);
		if(misComandos.getEstacionesFav()[3]==null){
			misComandos.guardarEstacion(misComandos.getEstacion(),3);
			JOptionPane.showMessageDialog(null,"Su Estaci�n se Guardo Correctamente.");
		}
    }
	//4
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
	jLabel2.setText(misComandos.getEstacionesFav()[4]);
 		if(misComandos.getEstacionesFav()[4]==null){
			misComandos.guardarEstacion(misComandos.getEstacion(),4);
			JOptionPane.showMessageDialog(null,"Su Estaci�n se Guardo Correctamente.");
		}
    }
	//5
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
	jLabel2.setText(misComandos.getEstacionesFav()[5]);
		if(misComandos.getEstacionesFav()[5]==null){
			misComandos.guardarEstacion(misComandos.getEstacion(),5);
			JOptionPane.showMessageDialog(null,"Su Estaci�n se Guardo Correctamente.");
		}
    }
	//6
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
	jLabel2.setText(misComandos.getEstacionesFav()[6]);
		if(misComandos.getEstacionesFav()[6]==null){
			misComandos.guardarEstacion(misComandos.getEstacion(),6);
			JOptionPane.showMessageDialog(null,"Su Estaci�n se Guardo Correctamente.");
		}
    }
	//7
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
	jLabel2.setText(misComandos.getEstacionesFav()[7]);
		if(misComandos.getEstacionesFav()[7]==null){
			misComandos.guardarEstacion(misComandos.getEstacion(),7);
			JOptionPane.showMessageDialog(null,"Su Estaci�n se Guardo Correctamente.");
		}
    }
	//8
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
	jLabel2.setText(misComandos.getEstacionesFav()[8]);
		if(misComandos.getEstacionesFav()[8]==null){
			misComandos.guardarEstacion(misComandos.getEstacion(),8);
			JOptionPane.showMessageDialog(null,"Su Estaci�n se Guardo Correctamente.");
		}
    }
	//9
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
	jLabel2.setText(misComandos.getEstacionesFav()[9]);
		if(misComandos.getEstacionesFav()[9]==null){
			misComandos.guardarEstacion(misComandos.getEstacion(),9);
			JOptionPane.showMessageDialog(null,"Su Estaci�n se Guardo Correctamente.");
		}
    }
	//10
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
	jLabel2.setText(misComandos.getEstacionesFav()[10]);
		if(misComandos.getEstacionesFav()[10]==null){
			misComandos.guardarEstacion(misComandos.getEstacion(),10);
			JOptionPane.showMessageDialog(null,"Su Estaci�n se Guardo Correctamente.");
		}
    }
	//11
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
	jLabel2.setText(misComandos.getEstacionesFav()[11]);
		if(misComandos.getEstacionesFav()[11]==null){
			misComandos.guardarEstacion(misComandos.getEstacion(),11);
			JOptionPane.showMessageDialog(null,"Su Estaci�n se Guardo Correctamente.");
		}	
	}
	
	//12
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
	jLabel2.setText(misComandos.getEstacionesFav()[12]);
		if(misComandos.getEstacionesFav()[12]==null){
			misComandos.guardarEstacion(misComandos.getEstacion(),12);
			JOptionPane.showMessageDialog(null,"Su Estaci�n se Guardo Correctamente.");
		}
    }
	//Anterior
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
		misComandos.cambiarEstacion(false);
		jLabel2.setText(Double.toString(misComandos.getEstacion()));
    }
	//Siguiente
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
		misComandos.cambiarEstacion(true);
		jLabel2.setText(Double.toString(misComandos.getEstacion()));		
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration

}
