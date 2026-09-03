package com.ethanlink.swissokyo_extension.tlm;

import com.ethanlink.swissokyo_extension.tlm.task.SaltCaneTask;
import com.github.tartaricacid.touhoulittlemaid.api.ILittleMaid;
import com.github.tartaricacid.touhoulittlemaid.api.LittleMaidExtension;
import com.github.tartaricacid.touhoulittlemaid.entity.task.TaskManager;

@LittleMaidExtension
public class SwissokyoExtensionTLMCompat implements ILittleMaid {
    @Override
    public void addMaidTask(TaskManager manager) {
        manager.add(new SaltCaneTask());
    }
}