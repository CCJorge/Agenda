/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.AgendaDao;
import javax.swing.table.AbstractTableModel;
import model.*;


/**
 *
 * @author JORGE
 */
public class JTableControl {

    private ModeloDeTabela meuModeloDeTabela;

    public JTableControl(ModeloDeTabela m) {
        this.meuModeloDeTabela = m;
        
    }

    /**
     * Cria uma TableModelAgenda e adiciona suas colunas
     */
    public void inicializarTableModel() {
        meuModeloDeTabela.addColumn("Nome");
        meuModeloDeTabela.addColumn("Celular");
        meuModeloDeTabela.addColumn("E-mail");
        meuModeloDeTabela.addColumn("Telefone");

    }

    /**
     * Grava os dados como um JSON em arquivo de texto e modifica a tabela
     */
    public void gravarDados() {
        AgendaDao.gravar(Agenda.getContatos());
        meuModeloDeTabela.fireTableDataChanged();
    }
    
    /**
     * Adiciona a coluna ao TableModelAgenda
     * @param coluna 
     */
    public void adicionarColuna(String coluna) {
        meuModeloDeTabela.addColumn(coluna);
    }
    
    public void removerRegistro(int rowIndex) {
        meuModeloDeTabela.removerRegistro(rowIndex);
    }
    
}
