/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao01;

/**
 *
 * @author Aluno
 */
public interface TurmaDAO {

    public boolean existe(Turma turma);

    public boolean salvar(Turma turma);
}
