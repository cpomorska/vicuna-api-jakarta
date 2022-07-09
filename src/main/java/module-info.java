module vicuna.app.jakarta {
    exports com.scprojekt.application.service;

    requires vicuna.core.lib;
    requires jakarta.persistence;
    requires lombok;
    requires jakarta.cdi;
    requires jakarta.transaction;
}