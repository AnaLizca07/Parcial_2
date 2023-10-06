package Excercise_2.Interfaces;

import Excercise_2.dto.LocalDTO;

import java.io.IOException;
import java.util.List;

public interface ILocal {
    LocalDTO findById(int id);
    List<LocalDTO> findAll() throws IOException,ClassNotFoundException;
    void save(LocalDTO local) throws IOException;
    void update(LocalDTO local) throws IOException;
    void delete(LocalDTO local) throws IOException;
}
