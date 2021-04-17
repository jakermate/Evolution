import utilities.Vector2d;

public class Settings {
    int startingPopulation = 100;
    int floraSpawnRate = 1;
    int startingFlora = 20;
    int[] environmentSize = {100, 100};

    // env size
    public void setEnvironmentSize(int x, int y){
        environmentSize[0] = x;
        environmentSize[1] = y;
    }
}
