/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author JORGE
 */
public class TableModelAgenda extends AbstractTableModel implements ModeloDeTabela {
    
    private Vector<String> colunas;

    public TableModelAgenda() {
        colunas = new Vector<>();
    }
    
    public void addColumn(String coluna) {
        colunas.add(coluna);
    }
    
    public void adicionaRegistro (Agenda contato) {
        Agenda.getContatos().add(contato);
        fireTableDataChanged();
    }
    
    public void removerRegistro (int rowIndex) {
        Agenda.getContatos().remove(rowIndex);
        fireTableDataChanged();
    }
    
    public Agenda getContato (int rowIndex) {
        return Agenda.getContatos().get(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return Agenda.getContatos().size();
    }

    @Override
    public int getColumnCount() {
        return colunas.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return Agenda.getContatos().get(rowIndex).getNome();
            case 1:
                return Agenda.getContatos().get(rowIndex).getCelular();
            case 2:
                return Agenda.getContatos().get(rowIndex).getEmail();
            case 3:
                return Agenda.getContatos().get(rowIndex).getTelefone();
            default:
                return Agenda.getContatos().get(rowIndex);
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return this.colunas.get(columnIndex);
    }
    
    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }

 
    
}
