package com.cassell.nightwatchman.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * create by 金明 on 2021/9/24.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TitleMsg {
    private int title_msg_id;
    private String title_msg_title;
    private String title_msg_msg;
}
