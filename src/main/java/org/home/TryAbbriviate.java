package org.home;

import org.apache.maven.shared.utils.StringUtils;

public class TryAbbriviate {

    public static void main(String[] args) {
        System.out.println(
                StringUtils.abbreviate(
                        "Привет всем кто живет на луне!",
                        20
                )
        );
    }

}
