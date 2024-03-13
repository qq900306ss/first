package org.example1.firstplugin.CopyConfig;

import org.example1.firstplugin.Firstplugin;

public class CopyConfig {
    public static void copy(){
        Firstplugin.firstplugin.saveResource("announcement.yml", false);

    }
}
