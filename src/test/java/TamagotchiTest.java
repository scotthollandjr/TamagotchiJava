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
    Integer expected = 0;
    assertEquals(expected, myTamagotchi.getPoopCount());
  }
  @Test
  public void Tamagotchi_getFullnessLevel_String() {
    Tamagotchi myTamagotchi = new Tamagotchi("Pepe", "0", "5", "6", "7");
    Integer expected = 5;
    assertEquals(expected, myTamagotchi.getFullnessLevel());
  }
  @Test
  public void Tamagotchi_getEnergyLevel_String() {
    Tamagotchi myTamagotchi = new Tamagotchi("Pepe", "0", "5", "6", "7");
    Integer expected = 6;
    assertEquals(expected, myTamagotchi.getEnergyLevel());
  }
  @Test
  public void Tamagotchi_getHappinessLevel_String() {
    Tamagotchi myTamagotchi = new Tamagotchi("Pepe", "0", "5", "6", "7");
    Integer expected = 7;
    assertEquals(expected, myTamagotchi.getHappinessLevel());
  }
  @Test
  public void Tamagotchi_getFeedTamagotchi_Integer() {
    Tamagotchi myTamagotchi = new Tamagotchi("Pepe", "0", "5", "6", "7");
    myTamagotchi.feedTamagotchi();
    assertEquals((Integer)0, myTamagotchi.getPoopCount());
    assertEquals((Integer)6, myTamagotchi.getFullnessLevel());
    assertEquals((Integer)8, myTamagotchi.getEnergyLevel());
    assertEquals((Integer)8, myTamagotchi.getHappinessLevel());
  }
  @Test
  public void Tamagotchi_getPlayWithTamagotchi_Integer() {
    Tamagotchi myTamagotchi = new Tamagotchi("Pepe", "0", "5", "6", "7");
    myTamagotchi.playWithTamagotchi();
    assertEquals((Integer)0, myTamagotchi.getPoopCount());
    assertEquals((Integer)3, myTamagotchi.getFullnessLevel());
    assertEquals((Integer)4, myTamagotchi.getEnergyLevel());
    assertEquals((Integer)9, myTamagotchi.getHappinessLevel());
  }
}
