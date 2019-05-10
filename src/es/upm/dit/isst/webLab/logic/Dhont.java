package es.upm.dit.isst.webLab.logic;

import java.util.ArrayList;
import java.util.List;

import es.upm.dit.isst.webLab.model.Resultados;

public class Dhont {

	public Dhont () {

	}

	public ArrayList<Integer> calculaScannosDhont (List<Resultados> listaresultados) {

		int escannosTotal = 0;
		int [] numeroVotosA = new int[listaresultados.size()];
		int [] escannosRepartidosA = new int[listaresultados.size()];
		int [] operacionA = new int[listaresultados.size()];
		ArrayList<Integer> al = new ArrayList<Integer>();

		//		Aqui obtenemos los escaños totales del parlamento que se vaya a comparar.
		for (int i = 0; i < listaresultados.size(); i++){
			escannosTotal += Integer.parseInt(listaresultados.get(i).escanos) ;
		}

		//		Aqui obtenemos el numero de votos de cada partido, ordenados de mas votados a menos votados.

		for (int i = 0 ; i < listaresultados.size(); i++){
			numeroVotosA [i]= Integer.parseInt(listaresultados.get(i).votos);
			escannosRepartidosA [i] = 0;
			operacionA [i] = 0;
		}


		for (int i = 0 ;  i < escannosTotal; i++) {
			for (int k = 0 ; k < numeroVotosA.length; k++) {
				int aux = numeroVotosA[k]/(escannosRepartidosA[k]+1);
				operacionA[k] = aux;
			}

			int max = 0;
			int ind = 0;

			for (int j = 0 ; j< operacionA.length; j++) {
				if (operacionA[j] > max ) {
					max = operacionA[j];
					ind = j;
				}
			}
			int numero = escannosRepartidosA[ind];
			numero = numero + 1 ;
			escannosRepartidosA[ind] = numero;
		}

		for (int k =  0 ; k < escannosRepartidosA.length; k++) {
			al.add(escannosRepartidosA[k]);
		}

		return al;

	}

	public ArrayList<String> calculaPartidoDhont (List<Resultados> listaresultados) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0 ; i < listaresultados.size(); i++){
			al.add(listaresultados.get(i).partido);
		}

		return al;
	}
	
	public ArrayList<String> provinciaPartidoDhont (List<Resultados> listaresultados) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0 ; i < listaresultados.size(); i++){
			al.add(listaresultados.get(i).provincia);
		}

		return al;
	}
	
	public ArrayList<String> calculaColorsDhont (List<Resultados> listaresultados) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0 ; i < listaresultados.size(); i++){
			al.add(listaresultados.get(i).colors);
		}

		return al;
	}
}

