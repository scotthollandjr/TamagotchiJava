import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TamagotchiTest {

  @Test
  public void Tamagotchi_instantiatesWithDescription_String() {
    Tamagotchi myTamagotchi = new Tamagotchi("Pepe", "0", "5", "6", "7");
    assertEquals("Pepe", myTamagotchi.getName());
  }
  @Test
  public void Tamagotchi_getPoopCount_String() {
    Tamagotchi myTamagotchi = new Tamagotchi("Pepe", "0", "5", "6", "7");
    assertEquals("0", myTamagotchi.getPoopCount());
  }
  @Test
  public void Tamagotchi_getHungerLevel_String() {
    Tamagotchi myTamagotchi = new Tamagotchi("Pepe", "0", "5", "6", "7");
    assertEquals("5", myTamagotchi.getHungerLevel());
  }
  @Test
  public void Tamagotchi_getEnergyLevel_String() {
    Tamagotchi myTamagotchi = new Tamagotchi("Pepe", "0", "5", "6", "7");
    assertEquals("6", myTamagotchi.getEnergyLevel());
  }

}
