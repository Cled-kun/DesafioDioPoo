package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	
	private int cargaHoraria;

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * (double)cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Cursos: TITULO= " + getTitulo() + ", DESCRIÇÃO= " + getDescricao() + ", CARGA HORÁRIA= " + cargaHoraria;
	}

}
