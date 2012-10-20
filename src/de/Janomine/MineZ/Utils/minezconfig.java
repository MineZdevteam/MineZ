package de.Janomine.MineZ.Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class minezconfig extends JavaPlugin {
	private String _filename;
	private FileConfiguration config;
    private File configFile;

	public minezconfig(String filename){
		configFile = new File(getDataFolder(), filename + ".yml");
		_filename = filename;
	    try {
	        firstRun();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public void saveYaml() {
	    try {
	        config.save(configFile);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	public void loadYaml() {
	    try {
	        config.load(configFile);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	private void firstRun() throws Exception {
	    if(!configFile.exists()){
	        configFile.getParentFile().mkdirs();
	        copy(getResource(_filename + ".yml"), configFile);
	    }
	}
	private void copy(InputStream in, File file) {
	    try {
	        OutputStream out = new FileOutputStream(file);
	        byte[] buf = new byte[1024];
	        int len;
	        while((len=in.read(buf))>0){
	            out.write(buf,0,len);
	        }
	        out.close();
	        in.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public String getString(String path){
		return config.getString(path);
	}
	public int getInt(String path){
		return config.getInt(path);
	}
	public boolean pathexists(String path){
		boolean status = false;
		try{
			config.getString(path);
			status = true;
		}catch(Exception e){status = false;}
		return status;
	}
	public double getDouble(String path){
		return config.getDouble(path);
	}
	public boolean getBoolean(String path){
		return config.getBoolean(path);
	}
	public Object get(String path){
		return config.get(path);
	}
	public void set(String path, int value){
		config.set(path, value);
	}
	public void set(String path, boolean value){
		config.set(path, value);
	}
	public void set(String path, String value){
		config.set(path, value);
	}
	public void set(String path, Double value){
		config.set(path, value);
	}
	public boolean contains(String path){
		return config.contains(path);
	}
	public void toDefault() throws FileNotFoundException{
		copy(getResource(_filename + ".yml"), configFile);
	}
	public void createSection(String path){
		config.createSection(path);
	}
	public FileConfiguration getFConfig(){
		return config;
	}
}
