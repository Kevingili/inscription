package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import metier.Personne;

public class UpdateSQL {
	Connection connection = null;
	public static void ModifierUneCompetition(Connection connection, JTextField textFieldNomComp, JTextField textFieldDateComp, JTextField textFieldIdComp)
	{
		try
		{
			String query = "Update Competition set nom = '"+textFieldNomComp.getText()+"', datecloture = '"+textFieldDateComp.getText()+"' where id_comp ='"+textFieldIdComp.getText()+"'";
			PreparedStatement pst = connection.prepareStatement(query);
			pst.execute();
			JOptionPane.showMessageDialog(null, "Data Updated");
			pst.close();
		}
		catch (Exception et)
		{
			et.printStackTrace();
		}
	}
	
	public static void ModifierUneEquipe(Connection connection, JTextField textFieldNomEquipe, JTextField textFieldIdEquipe)
	{
		try
		{
			String query = "Update Equipe set nom = '"+textFieldNomEquipe.getText()+"' where id_candE ='"+textFieldIdEquipe.getText()+"'";
			PreparedStatement pst = connection.prepareStatement(query);
			pst.execute();
			JOptionPane.showMessageDialog(null, "Data Updated");
			pst.close();
		}
		catch (Exception et)
		{
			et.printStackTrace();
		}
	}
	
	public static void ModifierUnePersonne(Connection connection, Personne modifierPersonne)
	{
		try
		{
			String query = "Update Personne set mail = '"+modifierPersonne.getMail()+"' where nom ='"+modifierPersonne.getNom()+"'";
			PreparedStatement pst = connection.prepareStatement(query);
			pst.execute();
			JOptionPane.showMessageDialog(null, "Data Updated");
			pst.close();
		}
		catch (Exception et)
		{
			et.printStackTrace();
		}
	}
}
