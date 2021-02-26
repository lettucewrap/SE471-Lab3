package com.Lab3;

public class AdvancedFactory implements ModeSelectionFactory{
    public CharacterSelectionPanel_IF createCharacterSelectionPanel(){
        return new AdvancedCharacterSelectionPanel();
    }
    public WeaponSelectionPanel_IF createWeaponSelectionPanel(){
        return new AdvancedWeaponSelectionPanel();
    }
}