package com.zodragame.zodra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var playerHP = 100
        var playerShield = 100
        var playerItems = {}

        fun Items(Name: String, Rarity: String, Usable: Boolean, IsAmmo: Boolean, Ammunition: String, AmmunitionFor: String) {
        val item_common_zodbox = {Items("common_zodbox", "common", true, false, "", "")}
        val item_uncommon_zodbox = {Items("uncommon_zodbox", "uncommon", true, false, "","")}
        val item_rare_zodbox = {Items("rare_zodbox", "rare", true, false, "","")}
        val item_ultra_rare_zodbox = {Items("ultra_rare_zodbox", "ultra_rare", true, false, "","")}
        val item_epic_zodbox = {Items("epic_zodbox", "epic", true, false, "","")}
        val item_glock_17 = {Items("glock-17", "common", true, false, "9mm_bullet","")}
        val item_9mm_bullet = {Items("9mm_bullet", "uncommon", false, true, "","glock-17")}
        }

        fun OpenZodBox(Rarity: String, DropChance: Int, Items: String, MaxItems: Int, RequiredItems: String, SumOfReqiredItems: Int) {
            if (Rarity == "Common") {
                val MaxItems = 1
            }
        }


    }
}