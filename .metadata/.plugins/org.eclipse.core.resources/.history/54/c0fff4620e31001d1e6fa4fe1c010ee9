package withpattern.service;

public enum TipoCargo {
	COORDENADOR {
		@Override
		public CalculaSalario calculaSalario() {
			return new ImpressaoHolerite(new Cordenador());
		}
	},
	DIRETOR {
		@Override
		public CalculaSalario calculaSalario() {
			return new Diretor();
		}
	},
	PROFESSOR {
		@Override
		public CalculaSalario calculaSalario() {
			return null;
		}
	};
	
	public abstract CalculaSalario calculaSalario(); 
}

