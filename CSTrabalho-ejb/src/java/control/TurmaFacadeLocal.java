/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.util.List;
import javax.ejb.Local;
import model.Turma;

/**
 *
 * @author bernardo
 */
@Local
public interface TurmaFacadeLocal {

    void create(Turma turma);

    void edit(Turma turma);

    void remove(Turma turma);

    Turma find(Object id);

    List<Turma> findAll();

    List<Turma> findRange(int[] range);

    int count();
    
}
