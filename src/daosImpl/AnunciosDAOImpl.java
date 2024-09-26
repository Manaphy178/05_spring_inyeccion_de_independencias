package daosImpl;

import java.util.List;

import daos.AnunciosDAO;
import datasources.DataSource;

public class AnunciosDAOImpl implements AnunciosDAO{
	private int maxAnunciosPortada;
	private DataSource miDataSource;
	
	public int getMaxAnunciosPortada() {
		return maxAnunciosPortada;
	}

	public void setMaxAnunciosPortada(int maxAnunciosPortada) {
		this.maxAnunciosPortada = maxAnunciosPortada;
	}

	public DataSource getMiDataSource() {
		return miDataSource;
	}

	public void setMiDataSource(DataSource miDataSource) {
		this.miDataSource = miDataSource;
	}

	@Override
	public List<?> obtenerAnunciosPortada() {
		System.out.println("accedo a base de datos para sacar anuncios");
		System.out.println("No sobrepasar"+maxAnunciosPortada+"anuncios");
		System.out.println("usamos como datasource o fuentes de datos:"
				+ "miDataSource");
		return null;
	}

}
