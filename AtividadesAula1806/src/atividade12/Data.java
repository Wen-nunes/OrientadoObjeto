package atividade12;

class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        validarData(dia, mes, ano);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private void validarData(int dia, int mes, int ano) {
        if (ano < 0) {
            throw new IllegalArgumentException("Ano inválido: " + ano);
        }

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido: " + mes);
        }

        int[] diasPorMes = {31, 28 + (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (dia < 1 || dia > diasPorMes[mes - 1]) {
            throw new IllegalArgumentException("Dia inválido para o mês e ano informados: " + dia + "/" + mes + "/" + ano);
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}