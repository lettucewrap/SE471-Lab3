package com.Lab3;

public class IntermediateFactory implements ModeSelectionFactory{
    public CharacterSelectionPanel_IF createCharacterSelectionPanel(){
        return new IntermediateCharacterSelectionPanel();
    }
    public WeaponSelectionPanel_IF createWeaponSelectionPanel(){
        return new IntermediateWeaponSelectionPanel();
    }
}
