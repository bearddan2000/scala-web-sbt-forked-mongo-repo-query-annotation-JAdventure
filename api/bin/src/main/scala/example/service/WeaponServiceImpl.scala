package example.service;

import example.model.Weapon;
import example.repository.WeaponRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.List;

/**
 * @author ragcrix
 */
@Service
class WeaponServiceImpl @Autowired() (
  weaponRepository: WeaponRepository
) extends WeaponService {

    override def findAll(): List[Weapon] = weaponRepository.findAll()

    override def findByName(name: String): Weapon =  weaponRepository.findByName(name)
}
