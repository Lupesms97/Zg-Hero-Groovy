package org.example.model
import groovy.transform.ToString

@ToString
class Vagas {
//    String titulo
    double salario
    String localizacao
    String tipoContrato
    String descricaoVaga
    List<Candidato> candidatoesDisponiveis


}
