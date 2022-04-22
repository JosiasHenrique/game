package com.br.jh.gamelistapi.entities.enums;

public enum Platform {
	PS4(1, "PlayStation 4"),
	XBOXONE(2, "XBOX ONE"),
	PC(3,"Pc");

	private int cod;
	private String descricao;

	private Platform(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}
	public String getDescricao() {
		return descricao;
	}

	public static Platform toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}
		for (Platform x : Platform.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}