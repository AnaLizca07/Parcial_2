package Excercise_2.services;

import Excercise_2.Interfaces.ILocal;
import Excercise_2.dto.LocalDTO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LocalImplements implements ILocal {

    private List<LocalDTO> locals;

    public LocalImplements() throws IOException,ClassNotFoundException{
        locals = new ArrayList<>();
    }
    @Override
    public LocalDTO findById(int id) {
        return locals.stream()
                .filter(locals -> locals.getId()==id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<LocalDTO> findAll() throws IOException, ClassNotFoundException {
        locals = (List<LocalDTO>) ObjectSerializable.readObjectFromFile("local.ax");
        return locals;
    }

    @Override
    public void save(LocalDTO local) throws IOException {
        locals.add(local);
        ObjectSerializable.writeObjectToFile(locals,"local.ax");
    }

    @Override
    public void update(LocalDTO local) throws IOException {
        LocalDTO oldLocal = findById(local.getId());
        if(oldLocal!=null){
            locals.remove(oldLocal);
            locals.add(local);
            ObjectSerializable.writeObjectToFile(locals,"local.ax");
        }

    }

    @Override
    public void delete(LocalDTO local) throws IOException {
        locals.remove(local);
        ObjectSerializable.writeObjectToFile(locals,"local.ax");

    }
}
