package br.com.softblue.javaee.bean;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import br.com.softblue.javaee.model.Despesa;

@Named("table")
@SessionScoped
public class TableBean implements Serializable {
	
	private List<Despesa> despesas = new ArrayList<>();
	
	public TableBean() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		/* Despesa d = new Despesa();
		
		try {
			d.setData(sdf.parse("12/02/2030"));
		} catch (ParseException e) {
		}
	
		d.setDescricao("Item Qualquer");
		d.setEdit(false);
		d.setValor(135.0);
		despesasList.add(d);
		
		d = new Despesa();
		
		try {
			d.setData(sdf.parse("13/03/2040"));
		} catch (ParseException e) {
		}
	
		d.setDescricao("Item Qualquer 2");
		d.setEdit(false);
		d.setValor(1111.0);
		despesasList.add(d); */
	}
	
	public String inserir() {
		Despesa d = new Despesa();
		d.setEdit(true);
		despesas.add(d);
		return null;
	}
	
	public String editar(Despesa despesa) {
		despesa.setEdit(true);
		return null;
	}
	
	public String gravar(Despesa despesa) {
		despesa.setEdit(false);
		return null;
	}
	
	public String excluir(Despesa despesa) {
		despesas.remove(despesa);
		return null;
	}
	
	public List<Despesa> getDespesas() {
		return despesas;
	}
}
