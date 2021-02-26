package com.Lab3;

public class TestGame {

    private CharacterSelectionPanel_IF characterSelectionPanel;
    private WeaponSelectionPanel_IF weaponSelectionPanel;

    public void createSelectionPanel(final ModeSelectionFactory factory) {
        setCharacterSelectionPanel(factory.createCharacterSelectionPanel());
        setWeaponSelectionPanel(factory.createWeaponSelectionPanel());
    }


    //------------------
    CharacterSelectionPanel_IF getCharacterSelectionPanel(final ModeSelectionFactory factory){
        return factory.createCharacterSelectionPanel();
    }
    public CharacterSelectionPanel_IF getCharacterSelectionPanel() {
        return characterSelectionPanel;
    }
    private void setCharacterSelectionPanel(CharacterSelectionPanel_IF characterSelectionPanel) {
        this.characterSelectionPanel = characterSelectionPanel;
    }
    //------------------



    //------------------
    WeaponSelectionPanel_IF getWeaponSelectionPanel(final ModeSelectionFactory factory){
        return factory.createWeaponSelectionPanel();
    }
    public WeaponSelectionPanel_IF getWeaponSelectionPanel() {
        return weaponSelectionPanel;
    }
    private void setWeaponSelectionPanel(WeaponSelectionPanel_IF weaponSelectionPanel) {
        this.weaponSelectionPanel = weaponSelectionPanel;
    }
    //------------------



    //------------------
    public static class ModeFactoryMaker{

        public enum ModeType{
            BEGINNER, INTERMEDIATE, ADVANCED
        }

        public static ModeSelectionFactory makeFactory(ModeType type) throws IllegalAccessException {
            switch (type){
                case BEGINNER:
                    return new BeginnerFactory();
                case INTERMEDIATE:
                    return new IntermediateFactory();
                case ADVANCED:
                    return new AdvancedFactory();
                default:
                    throw new IllegalAccessException();
            }
        }

    }


    public static void main(String[] args) throws IllegalAccessException {
        // write your code here
        TestGame game = new TestGame();

        System.out.println("Beginner Mode: ");
        game.createSelectionPanel(ModeFactoryMaker.makeFactory
                (ModeFactoryMaker.ModeType.BEGINNER));
        System.out.println(game.getCharacterSelectionPanel().getPanel());
        System.out.println(game.getWeaponSelectionPanel().getPanel());

        System.out.println("\nIntermediate Mode: ");
        game.createSelectionPanel(ModeFactoryMaker.makeFactory
                (ModeFactoryMaker.ModeType.INTERMEDIATE));
        System.out.println(game.getCharacterSelectionPanel().getPanel());
        System.out.println(game.getWeaponSelectionPanel().getPanel());

        System.out.println("\nAdvanced Mode: ");
        game.createSelectionPanel(ModeFactoryMaker.makeFactory
                (ModeFactoryMaker.ModeType.ADVANCED));
        System.out.println(game.getCharacterSelectionPanel().getPanel());
        System.out.println(game.getWeaponSelectionPanel().getPanel());

    }
}