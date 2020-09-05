package virtual_pet;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//this class is the VirtualPetTest
public class VirtualPetTest {

    @Test
    public void shouldSayHungryfor1() {
        //Arrange //The first VituralPet is the class the second VirtualPet is the Constructor
        VirtualPet underTest = new VirtualPet();
        //Act
        int result = underTest.getHunger();
        //Assert
        assertEquals(1, result);
    }

    @Test
    public void shouldSayThirstfor2() {
        //Arrange //The first VituralPet is the class the second VirtualPet is the Constructor
        VirtualPet underTest = new VirtualPet();
        //Act
        int result = underTest.getThirst();
        //Assert
        assertEquals(2, result);
    }

    @Test
    public void shouldSayBoredomfor3() {
        //Arrange //The first VituralPet is the class the second VirtualPet is the Constructor
        VirtualPet underTest = new VirtualPet();
        //Act
        int result = underTest.getBoredom();
        //Assert
        assertEquals(3, result);
    }

    @Test
    public void shouldSayTirenessfor4() {
        //Arrange //The first VituralPet is the class the second VirtualPet is the Constructor
        VirtualPet underTest = new VirtualPet();
        //Act
        int result = underTest.getTiredness();
        //Assert
        assertEquals(4, result);

    }

    @Test
    public void shouldSaySickness5() {
        //Arrange //The first VituralPet is the class the second VirtualPet is the Constructor
        VirtualPet underTest = new VirtualPet();
        //Act
        int result = underTest.getSickness();
        //Assert
        assertEquals(5, result);
    }

}



