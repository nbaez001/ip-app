package com.empresa.proyecto.ip.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

@Slf4j
@RestController
@RequestMapping
public class IpController {

    @GetMapping
    public ResponseEntity<Object> getIp() {
        return ResponseEntity.ok(getHostname());
    }

    public String getHostname() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            return inetAddress.getHostName();
        } catch (UnknownHostException e) {
            log.error(Arrays.toString(e.getStackTrace()));
            return "Unable to determine hostname";
        }
    }
}
