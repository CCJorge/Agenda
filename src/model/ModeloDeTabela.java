/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JORGE
 */
public interface ModeloDeTabela {
    public void addColumn(String coluna);
    public void adicionaRegistro (Agenda contato);
    public void removerRegistro (int rowIndex);
    public Agenda getContato (int rowIndex);
    public int getRowCount();
    public int getColumnCount();
    public Object getValueAt(int rowIndex, int columnIndex);
    public String getColumnName(int columnIndex);
    public void fireTableDataChanged();
}
