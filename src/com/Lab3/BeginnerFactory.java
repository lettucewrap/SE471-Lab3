package com.Lab3;

public class BeginnerFactory implements ModeSelectionFactory{
    public CharacterSelectionPanel_IF createCharacterSelectionPanel(){
        return new BeginnerCharacterSelectionPanel();
    }
    public WeaponSelectionPanel_IF createWeaponSelectionPanel(){
        return new BeginnerWeaponSelectionPanel();
    }
}
