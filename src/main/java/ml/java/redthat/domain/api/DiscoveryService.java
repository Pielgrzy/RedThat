package ml.java.redthat.domain.api;

import ml.java.redthat.domain.discovery.Discovery;
import ml.java.redthat.domain.discovery.DiscoveryDao;

import java.util.List;
import java.util.stream.Collectors;

public class DiscoveryService {
    private final DiscoveryDao discoveryDao = new DiscoveryDao();

    public List<DiscoveryBasicInfo> findAll() {
        return discoveryDao.findAll()
                .stream()
                .map(DiscoveryMapper::map)
                .collect(Collectors.toList());
    }

    public List<DiscoveryBasicInfo> findByCategory(int categoryId){
        return discoveryDao.findByCategory(categoryId)
                .stream()
                .map(DiscoveryMapper::map)
                .collect(Collectors.toList());
    }

    private static class DiscoveryMapper {
         static DiscoveryBasicInfo map(Discovery discovery) {
            return new DiscoveryBasicInfo(
                    discovery.getTitle(),
                    discovery.getUrl(),
                    discovery.getDescription(),
                    discovery.getDateAdded()
            );
        }
    }
}
