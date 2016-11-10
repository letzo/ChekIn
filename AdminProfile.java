import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author letzo
 */
public class AdminProfile extends javax.swing.JFrame {

	private String name;
	private static String event="";
    public AdminProfile() {
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

        adminHeader = new javax.swing.JLabel();
        adminTabPanel = new javax.swing.JTabbedPane();
        adminUserPanel = new javax.swing.JPanel();
        adminUserSearch = new javax.swing.JLabel();
        adminUserSearchField = new javax.swing.JTextField();
        adminUserNameList = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        adminUserPermissions = new javax.swing.JButton();
        adminUserData = new javax.swing.JButton();
        adminEventPanel = new javax.swing.JPanel();
        adminEventHeader = new javax.swing.JLabel();
        adminEventList = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        adminEventEdit = new javax.swing.JButton();
        adminEventEnd = new javax.swing.JButton();
        adminEventCreate = new javax.swing.JButton();
        adminEventDelete = new javax.swing.JButton();
        adminEventStart = new javax.swing.JButton();
        adminStatPanel = new javax.swing.JPanel();
        adminStatHeader = new javax.swing.JLabel();
        adminStatEventMenu = new javax.swing.JComboBox<>();
        adminStatEvent = new javax.swing.JLabel();
        adminStatAgeMenu = new javax.swing.JComboBox<>();
        adminStatData = new javax.swing.JLabel();
        adminStatReport = new javax.swing.JLabel();
        adminStatPopular = new javax.swing.JCheckBox();
        adminStatAverage = new javax.swing.JCheckBox();
        adminStatBest = new javax.swing.JCheckBox();
        adminStatGenerate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminUserNameList.setViewportView(jList2);

        adminUserPermissions.setText("Edit Permissions");

        adminUserData.setText("View User Data");
        
        adminHeader.setText("Event Management");

        adminUserSearch.setText("Search Members:");

        adminUserPermissions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUserPermissionsActionPerformed(evt);
            }
        });   

        adminUserData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUserDataActionPerformed(evt);
            }
        });   
        
        javax.swing.GroupLayout adminUserPanelLayout = new javax.swing.GroupLayout(adminUserPanel);
        adminUserPanel.setLayout(adminUserPanelLayout);
        adminUserPanelLayout.setHorizontalGroup(
            adminUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(adminUserNameList)
                    .addGroup(adminUserPanelLayout.createSequentialGroup()
                        .addComponent(adminUserSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminUserSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(adminUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminUserPermissions)
                    .addComponent(adminUserData))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminUserPanelLayout.setVerticalGroup(
            adminUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminUserSearch)
                    .addComponent(adminUserSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminUserNameList, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addGroup(adminUserPanelLayout.createSequentialGroup()
                        .addComponent(adminUserPermissions)
                        .addGap(18, 18, 18)
                        .addComponent(adminUserData)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        adminHandle userList = new adminHandle();
        
        adminUserSearchField.addKeyListener(userList);
        
        
        adminTabPanel.addTab("Users", adminUserPanel);

        adminEventHeader.setText("Event List");

  /*      jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Fundraising10252016", "Conference10262016", "Presentation10272016", "Naw10031975" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });*/
        
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
                	
        try{
        	Database eventlist = new Database();
        	String[] strings = new String[eventlist.readEventList().size()];
    		for(int i =0;i<strings.length;i++){
    			strings[i] = eventlist.readEventList().get(i);
    		}
        	jList1.setModel(new javax.swing.AbstractListModel<String>() {
        		public int getSize() { return strings.length; }
        		public String getElementAt(int i) { return strings[i]; }
        		});
        }
        catch(IOException e){
        	
        }
        
        adminEventList.setViewportView(jList1);

        adminEventEdit.setText("Edit");

        adminEventEnd.setText("End Event");

        adminEventCreate.setText("Create New Event");

        adminEventStart.setText("Start Event");

        adminEventDelete.setText("Delete Event");

        javax.swing.GroupLayout adminEventPanelLayout = new javax.swing.GroupLayout(adminEventPanel);
        adminEventPanel.setLayout(adminEventPanelLayout);
        adminEventPanelLayout.setHorizontalGroup(
            adminEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminEventPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminEventHeader)
                    .addGroup(adminEventPanelLayout.createSequentialGroup()
                        .addComponent(adminEventList, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(adminEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminEventStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminEventEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminEventEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(adminEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminEventCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminEventDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        adminEventPanelLayout.setVerticalGroup(
            adminEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminEventPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminEventHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminEventList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(adminEventPanelLayout.createSequentialGroup()
                        .addGroup(adminEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminEventEdit)
                            .addComponent(adminEventCreate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(adminEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminEventStart)
                            .addComponent(adminEventDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminEventEnd)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        
  
        adminTabPanel.addTab("Events", adminEventPanel);

        adminStatHeader.setText("Generate Event Statistics");

        adminStatEventMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fundraiser", "study", "?", "?" }));
        adminStatEventMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminStatEventMenuActionPerformed(evt);
            }
        });

        adminEventStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEventStartActionPerformed(evt);
            }
        });        

        adminEventEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEventEndActionPerformed(evt);
            }
        });  
        
        adminEventCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEventCreateActionPerformed(evt);
            }
        });   
        
        adminEventDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEventDeleteActionPerformed(evt);
            }
        });   
        
        adminEventEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEventEditActionPerformed(evt);
            }
        });   
        
        adminStatEvent.setText("Event Type");

        adminStatAgeMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Age", "Attendance", "Day", "Frequency" }));
        adminStatAgeMenu.setToolTipText("");

        adminStatData.setText("Data Type");

        adminStatReport.setText("Event Reports");

        adminStatPopular.setText("Popular");

        adminStatAverage.setText("Averages");

        adminStatBest.setText("YTD Best");

        adminStatGenerate.setText("Generate!");
        adminStatGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminStatGenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminStatPanelLayout = new javax.swing.GroupLayout(adminStatPanel);
        adminStatPanel.setLayout(adminStatPanelLayout);
        adminStatPanelLayout.setHorizontalGroup(
            adminStatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminStatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminStatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminStatPanelLayout.createSequentialGroup()
                        .addGroup(adminStatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminStatEventMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminStatEvent))
                        .addContainerGap(294, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminStatPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(adminStatHeader)
                        .addGap(117, 117, 117))
                    .addGroup(adminStatPanelLayout.createSequentialGroup()
                        .addGroup(adminStatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminStatAverage)
                            .addComponent(adminStatPopular)
                            .addComponent(adminStatAgeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminStatData)
                            .addComponent(adminStatReport))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(adminStatPanelLayout.createSequentialGroup()
                        .addComponent(adminStatBest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminStatGenerate))))
        );
        adminStatPanelLayout.setVerticalGroup(
            adminStatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminStatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminStatHeader)
                .addGap(3, 3, 3)
                .addComponent(adminStatEvent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminStatEventMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(adminStatData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminStatAgeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminStatReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminStatPopular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminStatAverage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminStatBest)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminStatPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(adminStatGenerate))
        );

        adminTabPanel.addTab("Statistics", adminStatPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminHeader)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addComponent(adminTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(adminHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminTabPanel))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminStatEventMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminStatEventMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminStatEventMenuActionPerformed

    private void adminStatGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminStatGenerateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminStatGenerateActionPerformed

    private void adminEventDeleteActionPerformed(java.awt.event.ActionEvent evt) {
    	int index = jList1.getSelectedIndex();
    	try{
    		Database deleteevent = new Database();
    		deleteevent.deleteEventList(jList1.getSelectedValue());
    	}
    	catch(IOException e){
    		
    	}
    	String[] create = new String[jList1.getModel().getSize()];
    	for(int i = 0; i<index;i++)
    		create[i]= jList1.getModel().getElementAt(i);
    	for(int j = index+1; j<jList1.getModel().getSize();j++)
    		create[j]= jList1.getModel().getElementAt(j);
    	jList1.setModel(new javax.swing.AbstractListModel<String>() {
    		public int getSize() { return create.length; }
    		public String getElementAt(int i) { return create[i]; }
    		});  
    	
    }
    
    private void adminEventEditActionPerformed(java.awt.event.ActionEvent evt) {
    	int index = jList1.getSelectedIndex();
    	String eventType;
    	String eventDate;
    	String[] create = new String[jList1.getModel().getSize()];
    	for(int i = 0; i<jList1.getModel().getSize();i++)
    		create[i]= jList1.getModel().getElementAt(i);
    	eventType = JOptionPane.showInputDialog("Enter Event Type.");
    	eventDate = JOptionPane.showInputDialog("Enter Event Date.\n"+"MMDDYYYY");
    	create[index] = eventType+eventDate;
    	try{
    		Database event = new Database();
    		event.deleteEventList(jList1.getSelectedValue());
    		event.writeEventList(eventType+eventDate);
    	}
    	catch(IOException e){
    		
    	}
    	jList1.setModel(new javax.swing.AbstractListModel<String>() {
    		public int getSize() { return create.length; }
    		public String getElementAt(int i) { return create[i]; }
    		});    	
    	
    }
    
    private void adminEventCreateActionPerformed(java.awt.event.ActionEvent evt) {
    	String eventType;
    	String eventDate;
    	String[] create = new String[jList1.getModel().getSize()+1];
    	for(int i = 0; i<jList1.getModel().getSize();i++)
    		create[i]= jList1.getModel().getElementAt(i);
    	eventType = JOptionPane.showInputDialog("Enter Event Type.");
    	eventDate = JOptionPane.showInputDialog("Enter Event Date.\n"+"MMDDYYYY");
    	create[jList1.getModel().getSize()] = eventType+eventDate;
    	jList1.setModel(new javax.swing.AbstractListModel<String>() {
    		public int getSize() { return create.length; }
    		public String getElementAt(int i) { return create[i]; }
    		});
    	try{
    		String eventformal=eventType+eventDate;
    		Database newevent = new Database();
    		newevent.writeEventList(eventformal);
    	}
    	catch(IOException e){
    		
    	}
    	
    }
    
    private void adminEventStartActionPerformed(java.awt.event.ActionEvent evt) {
    	event = jList1.getSelectedValue();
    	setVisible(false);
    	new CheckinScreen().setVisible(true);
    }

    private void adminEventEndActionPerformed(java.awt.event.ActionEvent evt) {
    	event = "";
    	setVisible(false);
    	new CheckinScreen().setVisible(true);
    }
    
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {                                    

    }
    
    private void adminUserPermissionsActionPerformed(java.awt.event.ActionEvent evt) {
    	name = jList2.getSelectedValue();
    	try{
    		Database permission = new Database();
        	if(permission.readPermissions(name)){
        		System.out.println("this should be a dialog but now switching permissions to User");
        		permission.writePermissions(name, 0);
        	}
        	else{
        		System.out.println("GOD MODE!@!@!@");
    			permission.writePermissions(name, 1);
    		}
    	}
    	catch(IOException e){
    		
    	}
    }
    
    private void adminUserDataActionPerformed(java.awt.event.ActionEvent evt) {
    	name = jList2.getSelectedValue();
    	try{
    		Database info = new Database();
    		String[] strings = new String[info.readEvent(name).size()+5];
    		strings[0] = name;
    		strings[1] = "Email: " + info.readEmail(name);
    		strings[2] = "DOB: " +info.readBirth(name);
    		strings[3] = "Events Attended:";
    		strings[4] = "";
    		int index = 0;
			for(int i =5;i<strings.length;i++){
				strings[i] = info.readEvent(name).get(index);
				index++;
			}
		
        	jList2.setModel(new javax.swing.AbstractListModel<String>() {
        		public int getSize() { return strings.length; }
        		public String getElementAt(int i) { return strings[i]; }
        		});
    	}
    	catch(IOException e){
    		
    	}
        
    }
    
    private class adminHandle implements KeyListener{
    	public void keyReleased(KeyEvent e){    			
    		Database searching = new Database();
    		String search = "";
    		search = adminUserSearchField.getText();
    		try {
    			String[] strings = new String[searching.findUser(search).size()];
    			for(int i =0;i<strings.length;i++)
					strings[i] = searching.findUser(search).get(i);
			
    			jList2.setModel(new javax.swing.AbstractListModel<String>() {
    				public int getSize() { return strings.length; }
    				public String getElementAt(int i) { return strings[i]; }
    				});
    		}
    		catch (IOException e1) {
    			System.out.println("wheres the file bro");
    		}
    	}
    	public void keyPressed(KeyEvent e){}
    	public void keyTyped(KeyEvent e){


    	}
    	
    }
    

    public static String getEvent(){
    	return event;
    }
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
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminProfile().setVisible(true);
            }
        });
    }

    private javax.swing.JButton adminEventDelete;
    private javax.swing.JButton adminEventCreate;
    private javax.swing.JButton adminEventEnd;
    private javax.swing.JButton adminEventStart;
    private javax.swing.JButton adminEventEdit;
    private javax.swing.JLabel adminEventHeader;
    private javax.swing.JScrollPane adminEventList;
    private javax.swing.JPanel adminEventPanel;
    private javax.swing.JLabel adminHeader;
    private javax.swing.JComboBox<String> adminStatAgeMenu;
    private javax.swing.JCheckBox adminStatAverage;
    private javax.swing.JCheckBox adminStatBest;
    private javax.swing.JLabel adminStatData;
    private javax.swing.JLabel adminStatEvent;
    private javax.swing.JComboBox<String> adminStatEventMenu;
    private javax.swing.JButton adminStatGenerate;
    private javax.swing.JLabel adminStatHeader;
    private javax.swing.JPanel adminStatPanel;
    private javax.swing.JCheckBox adminStatPopular;
    private javax.swing.JLabel adminStatReport;
    private javax.swing.JTabbedPane adminTabPanel;
    private javax.swing.JScrollPane adminUserNameList;
    private javax.swing.JPanel adminUserPanel;
    private javax.swing.JLabel adminUserSearch;
    private javax.swing.JTextField adminUserSearchField;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JButton adminUserPermissions;
    private javax.swing.JButton adminUserData;

    
    // End of variables declaration//GEN-END:variables
}
