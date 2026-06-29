package ko.co.sboard.springboardapp.config;

import ko.co.sboard.springboardapp.dto.AppInfoDTO;
import ko.co.sboard.springboardapp.intercepter.AppInfoIntercepter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    private AppInfoDTO appInfo;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AppInfoIntercepter(appInfo));
    }

    @Bean
    public AppInfoDTO appInfo(){
        appInfo = new AppInfoDTO();
        return appInfo;
    }
}
